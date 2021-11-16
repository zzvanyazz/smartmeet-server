package com.lemonado.smartmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(excludeName = "com.lemonado.smartmeet")
public class SmartMeetServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartMeetServerApplication.class, args);
    }

}
