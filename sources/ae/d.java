package ae;

import java.util.concurrent.Executor;
import td.a0;
import td.x0;
import yd.v;
public final class d extends x0 implements Executor {
    public static final d f420c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = m.f432c;
        int i10 = v.f54421a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = yd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < l.d) {
                if (j10 >= 1) {
                    a0Var = new yd.i(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(i0.a.i(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(i0.a.i(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(cd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(cd.i.f4123a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
