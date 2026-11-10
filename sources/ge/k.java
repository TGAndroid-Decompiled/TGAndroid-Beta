package ge;

import ee.t;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f13859a;
    public static final long f13860b;
    public static final int f13861c;
    public static final int d;
    public static final long f13862e;
    public static final g f13863f;

    static {
        String str;
        int i7 = t.f10801a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f13859a = str;
        f13860b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = t.f10801a;
        if (i10 < 2) {
            i10 = 2;
        }
        f13861c = ee.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13862e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13863f = g.f13854a;
    }
}
