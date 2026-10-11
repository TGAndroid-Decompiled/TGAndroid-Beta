package he;

import ae.b0;
import ae.z0;
import fe.v;
import java.util.concurrent.Executor;
public final class d extends z0 implements Executor {
    public static final d f11112c = new b0();
    public static final b0 d;

    static {
        b0 b0Var = l.f11124c;
        int i10 = v.f9916a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j3 = fe.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        b0Var.getClass();
        if (j3 >= 1) {
            if (j3 < k.d) {
                if (j3 >= 1) {
                    b0Var = new fe.i(b0Var, j3);
                } else {
                    throw new IllegalArgumentException(hg.c.h(j3, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = b0Var;
            return;
        }
        throw new IllegalArgumentException(hg.c.h(j3, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(jd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(jd.i.f14128a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
