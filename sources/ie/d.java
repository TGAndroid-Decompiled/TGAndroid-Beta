package ie;

import be.a0;
import be.y0;
import ge.v;
import java.util.concurrent.Executor;
public final class d extends y0 implements Executor {
    public static final d f12795c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f12806c;
        int i10 = v.f11043a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = ge.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < k.d) {
                if (j10 >= 1) {
                    a0Var = new ge.i(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(i2.e.j(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(i2.e.j(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(kd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(kd.i.f15031a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
