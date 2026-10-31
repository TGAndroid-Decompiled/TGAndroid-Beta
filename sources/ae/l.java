package ae;

import java.util.concurrent.TimeUnit;
import yd.v;
public abstract class l {
    public static final String f427a;
    public static final long f428b;
    public static final int f429c;
    public static final int d;
    public static final long e;
    public static final g f430f;
    public static final j f431g;
    public static final j h;

    static {
        String str;
        int i10 = v.f54421a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f427a = str;
        f428b = yd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f54421a;
        if (i11 < 2) {
            i11 = 2;
        }
        f429c = yd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = yd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(yd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f430f = g.f421a;
        f431g = new j(0);
        h = new j(1);
    }
}
