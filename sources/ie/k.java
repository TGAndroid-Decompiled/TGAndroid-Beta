package ie;

import ge.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f12799a;
    public static final long f12800b;
    public static final int f12801c;
    public static final int d;
    public static final long e;
    public static final g f12802f;
    public static final com.google.android.gms.internal.cast.a f12803g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f11041a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f12799a = str;
        f12800b = ge.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f11041a;
        if (i11 < 2) {
            i11 = 2;
        }
        f12801c = ge.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ge.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ge.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f12802f = g.f12794a;
        f12803g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
