package ge;

import ee.w;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f9640a;
    public static final long f9641b;
    public static final int f9642c;
    public static final int d;
    public static final long e;
    public static final g f9643f;
    public static final com.google.android.gms.internal.cast.a f9644g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = w.f8198a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9640a = str;
        f9641b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f8198a;
        if (i11 < 2) {
            i11 = 2;
        }
        f9642c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9643f = g.f9635a;
        f9644g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
