package he;

import fe.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f11117a;
    public static final long f11118b;
    public static final int f11119c;
    public static final int d;
    public static final long f11120e;
    public static final g f11121f;
    public static final com.google.android.gms.internal.cast.a f11122g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f9915a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f11117a = str;
        f11118b = fe.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f9915a;
        if (i11 < 2) {
            i11 = 2;
        }
        f11119c = fe.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = fe.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f11120e = TimeUnit.SECONDS.toNanos(fe.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f11121f = g.f11112a;
        f11122g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
