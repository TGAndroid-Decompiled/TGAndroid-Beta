package je;

import he.w;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f15603a;
    public static final long f15604b;
    public static final int f15605c;
    public static final int d;
    public static final long e;
    public static final g f15606f;
    public static final ag.j f15607g;
    public static final ag.j h;

    static {
        String str;
        int i10 = w.f12821a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f15603a = str;
        f15604b = he.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f12821a;
        if (i11 < 2) {
            i11 = 2;
        }
        f15605c = he.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = he.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(he.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f15606f = g.f15598a;
        f15607g = new ag.j(0);
        h = new ag.j(1);
    }
}
