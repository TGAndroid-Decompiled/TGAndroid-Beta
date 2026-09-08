package ge;

import ee.v;
import java.util.concurrent.Executor;
import zd.a0;
import zd.x0;
public final class d extends x0 implements Executor {
    public static final d f10637c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f10649c;
        int i10 = v.f9122a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j3 = ee.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j3 >= 1) {
            if (j3 < k.d) {
                if (j3 >= 1) {
                    a0Var = new ee.i(a0Var, j3);
                } else {
                    throw new IllegalArgumentException(i2.g.i(j3, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(i2.g.i(j3, "Expected positive parallelism level, but got ").toString());
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
        c(id.i.f11980a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
