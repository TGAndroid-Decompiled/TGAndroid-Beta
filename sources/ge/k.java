package ge;

import ee.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f10480a;
    public static final long f10481b;
    public static final int f10482c;
    public static final int d;
    public static final long f10483e;
    public static final g f10484f;
    public static final com.google.android.gms.internal.cast.a f10485g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f8895a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10480a = str;
        f10481b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f8895a;
        if (i11 < 2) {
            i11 = 2;
        }
        f10482c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10483e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10484f = g.f10475a;
        f10485g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
