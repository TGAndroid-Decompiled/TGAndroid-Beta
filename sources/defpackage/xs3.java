package defpackage;

import java.util.concurrent.TimeUnit;
public enum xs3 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    public final TimeUnit a;

    xs3(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
