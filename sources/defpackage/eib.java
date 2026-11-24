package defpackage;

import java.util.concurrent.TimeUnit;
public abstract class eib {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final k4f f;

    static {
        String str;
        int i = ifb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = bxe.a("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = ifb.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = bxe.b(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = bxe.b(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(bxe.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = k4f.d;
    }
}
