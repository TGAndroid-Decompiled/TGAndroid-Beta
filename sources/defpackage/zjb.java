package defpackage;

import java.util.concurrent.TimeUnit;
public abstract class zjb {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final z6f f;

    static {
        String str;
        int i = chb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = rze.a("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = chb.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = rze.b(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = rze.b(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(rze.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = z6f.d;
    }
}
