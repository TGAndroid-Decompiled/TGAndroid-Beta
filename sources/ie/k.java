package ie;

import ge.v;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f12831a;
    public static final long f12832b;
    public static final int f12833c;
    public static final int d;
    public static final long e;
    public static final g f12834f;
    public static final com.google.android.gms.internal.cast.a f12835g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i10 = v.f11060a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f12831a = str;
        f12832b = ge.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f11060a;
        if (i11 < 2) {
            i11 = 2;
        }
        f12833c = ge.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ge.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ge.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f12834f = g.f12826a;
        f12835g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
