package hd;

import h7.s7;
import java.util.concurrent.TimeUnit;

public final class c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    public final TimeUnit f8917a;

    static {
        s7.a(cVarArr);
    }

    public c(TimeUnit timeUnit) {
        super(str, i);
        this.f8917a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f8916n.clone();
    }
}
