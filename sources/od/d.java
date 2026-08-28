package od;

import hd.a0;
import hd.y0;
import j3.r0;
import java.util.concurrent.Executor;
import md.v;
public final class d extends y0 implements Executor {
    public static final d f19218c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f19230c;
        int i9 = v.f17672a;
        if (64 >= i9) {
            i9 = 64;
        }
        int j10 = md.a.j(i9, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < k.d) {
                if (j10 >= 1) {
                    a0Var = new md.i(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(r0.l(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(r0.l(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(qc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(qc.i.f46140a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
