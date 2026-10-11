package he;

import fe.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f11118a;
    public static final long f11119b;
    public static final int f11120c;
    public static final int d;
    public static final long f11121e;
    public static final g f11122f;
    public static final com.google.android.gms.internal.cast.a f11123g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f9916a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f11118a = str;
        f11119b = fe.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f9916a;
        if (i11 < 2) {
            i11 = 2;
        }
        f11120c = fe.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = fe.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f11121e = TimeUnit.SECONDS.toNanos(fe.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f11122f = g.f11113a;
        f11123g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
