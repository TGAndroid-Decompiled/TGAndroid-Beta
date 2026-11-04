package de;

import be.u;
import java.util.concurrent.Executor;
import wd.u0;
import wd.x;
public final class d extends u0 implements Executor {
    public static final d f8823c = new x();
    public static final x d;

    static {
        l lVar = l.f8834c;
        int i3 = u.f3286a;
        if (64 >= i3) {
            i3 = 64;
        }
        d = lVar.f(be.a.j(i3, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void c(fd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(fd.i.f11567a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
