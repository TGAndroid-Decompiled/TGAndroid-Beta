package je;

import ce.a0;
import ce.y0;
import he.w;
import java.util.concurrent.Executor;
public final class d extends y0 implements Executor {
    public static final d f15597c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f15608c;
        int i10 = w.f12821a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = he.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < k.d) {
                if (j10 >= 1) {
                    a0Var = new he.i(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(ic.a.i(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(ic.a.i(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(ld.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(ld.i.f16987a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
