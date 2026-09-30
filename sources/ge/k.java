package ge;

import ee.w;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f9638a;
    public static final long f9639b;
    public static final int f9640c;
    public static final int d;
    public static final long e;
    public static final g f9641f;
    public static final com.google.android.gms.internal.cast.a f9642g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = w.f8197a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9638a = str;
        f9639b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f8197a;
        if (i11 < 2) {
            i11 = 2;
        }
        f9640c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9641f = g.f9633a;
        f9642g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
