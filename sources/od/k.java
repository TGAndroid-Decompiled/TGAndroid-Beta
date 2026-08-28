package od;

import java.util.concurrent.TimeUnit;
import md.v;
public abstract class k {
    public static final String f19224a;
    public static final long f19225b;
    public static final int f19226c;
    public static final int d;
    public static final long f19227e;
    public static final g f19228f;
    public static final com.google.android.gms.internal.cast.a f19229g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i9 = v.f17672a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f19224a = str;
        f19225b = md.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = v.f17672a;
        if (i10 < 2) {
            i10 = 2;
        }
        f19226c = md.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = md.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19227e = TimeUnit.SECONDS.toNanos(md.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19228f = g.f19219a;
        f19229g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
