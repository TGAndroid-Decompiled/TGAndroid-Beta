package defpackage;

import java.util.concurrent.TimeUnit;
public enum fs3 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    public final TimeUnit a;

    fs3(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
