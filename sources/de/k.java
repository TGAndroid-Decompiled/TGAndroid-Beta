package de;

import be.u;
import java.util.concurrent.TimeUnit;
public abstract class k {
    public static final String f8829a;
    public static final long f8830b;
    public static final int f8831c;
    public static final int d;
    public static final long f8832e;
    public static final g f8833f;

    static {
        String str;
        int i3 = u.f3286a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f8829a = str;
        f8830b = be.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f3286a;
        if (i10 < 2) {
            i10 = 2;
        }
        f8831c = be.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = be.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f8832e = TimeUnit.SECONDS.toNanos(be.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f8833f = g.f8824a;
    }
}
