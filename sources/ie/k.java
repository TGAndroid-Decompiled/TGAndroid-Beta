package ie;

import ge.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f11410a;
    public static final long f11411b;
    public static final int f11412c;
    public static final int d;
    public static final long e;
    public static final g f11413f;
    public static final com.google.android.gms.internal.cast.a f11414g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f10134a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f11410a = str;
        f11411b = ge.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f10134a;
        if (i11 < 2) {
            i11 = 2;
        }
        f11412c = ge.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ge.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ge.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f11413f = g.f11405a;
        f11414g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
