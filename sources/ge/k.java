package ge;

import ee.t;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f13857a;
    public static final long f13858b;
    public static final int f13859c;
    public static final int d;
    public static final long f13860e;
    public static final g f13861f;

    static {
        String str;
        int i7 = t.f10796a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f13857a = str;
        f13858b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = t.f10796a;
        if (i10 < 2) {
            i10 = 2;
        }
        f13859c = ee.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13860e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13861f = g.f13852a;
    }
}
