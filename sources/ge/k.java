package ge;

import ee.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f10615a;
    public static final long f10616b;
    public static final int f10617c;
    public static final int d;
    public static final long f10618e;
    public static final g f10619f;
    public static final com.google.android.gms.internal.cast.a f10620g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f9094a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10615a = str;
        f10616b = ee.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f9094a;
        if (i11 < 2) {
            i11 = 2;
        }
        f10617c = ee.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ee.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10618e = TimeUnit.SECONDS.toNanos(ee.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10619f = g.f10610a;
        f10620g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
