package ge;

import ee.w;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f9632a;
    public static final long f9633b;
    public static final int f9634c;
    public static final int d;
    public static final long e;
    public static final g f9635f;
    public static final com.google.android.gms.internal.cast.a f9636g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = w.f8187a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9632a = str;
        f9633b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f8187a;
        if (i11 < 2) {
            i11 = 2;
        }
        f9634c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9635f = g.f9627a;
        f9636g = new com.google.android.gms.internal.cast.a(0, false);
        h = new com.google.android.gms.internal.cast.a(1, false);
    }
}
