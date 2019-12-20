package com.tyf.logtest.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleProducer {

    private static Logger log = LogManager.getLogger("kafkaLog");

    public static void main(String[] args) {
        for (int i = 10; i < 20; i++) {
            log.info("Hello---" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}