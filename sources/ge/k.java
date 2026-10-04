package ge;

import ee.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f10479a;
    public static final long f10480b;
    public static final int f10481c;
    public static final int d;
    public static final long f10482e;
    public static final g f10483f;
    public static final com.google.android.gms.internal.cast.a f10484g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f8894a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10479a = str;
        f10480b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f8894a;
        if (i11 < 2) {
            i11 = 2;
        }
        f10481c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10482e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10483f = g.f10474a;
        f10484g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
