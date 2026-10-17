package ie;

import ge.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f12803a;
    public static final long f12804b;
    public static final int f12805c;
    public static final int d;
    public static final long e;
    public static final g f12806f;
    public static final com.google.android.gms.internal.cast.a f12807g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f11042a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f12803a = str;
        f12804b = ge.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f11042a;
        if (i11 < 2) {
            i11 = 2;
        }
        f12805c = ge.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ge.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ge.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f12806f = g.f12798a;
        f12807g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
