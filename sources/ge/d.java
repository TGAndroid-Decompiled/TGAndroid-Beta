package ge;

import ee.t;
import java.util.concurrent.Executor;
import zd.u0;
import zd.x;
public final class d extends u0 implements Executor {
    public static final d f13851c = new x();
    public static final x d;

    static {
        l lVar = l.f13862c;
        int i7 = t.f10796a;
        if (64 >= i7) {
            i7 = 64;
        }
        d = lVar.f(ee.a.j(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(id.i.f15453a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
