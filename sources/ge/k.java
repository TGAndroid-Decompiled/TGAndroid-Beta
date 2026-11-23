package ge;

import ee.u;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f13545a;
    public static final long f13546b;
    public static final int f13547c;
    public static final int d;
    public static final long f13548e;
    public static final g f13549f;

    static {
        String str;
        int i7 = u.f10981a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f13545a = str;
        f13546b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f10981a;
        if (i10 < 2) {
            i10 = 2;
        }
        f13547c = ee.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13548e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13549f = g.f13540a;
    }
}
