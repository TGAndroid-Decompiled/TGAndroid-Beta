package ge;

import ee.u;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f13516a;
    public static final long f13517b;
    public static final int f13518c;
    public static final int d;
    public static final long f13519e;
    public static final g f13520f;

    static {
        String str;
        int i7 = u.f10952a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f13516a = str;
        f13517b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f10952a;
        if (i10 < 2) {
            i10 = 2;
        }
        f13518c = ee.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13519e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13520f = g.f13511a;
    }
}
