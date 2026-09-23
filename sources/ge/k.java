package ge;

import ee.w;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f9627a;
    public static final long f9628b;
    public static final int f9629c;
    public static final int d;
    public static final long e;
    public static final g f9630f;
    public static final com.google.android.gms.internal.cast.a f9631g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = w.f8186a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9627a = str;
        f9628b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f8186a;
        if (i11 < 2) {
            i11 = 2;
        }
        f9629c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9630f = g.f9622a;
        f9631g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
