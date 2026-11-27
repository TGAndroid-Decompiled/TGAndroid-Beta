package defpackage;

import java.util.concurrent.Executor;
public final class qb3 extends o54 implements Executor {
    public static final qb3 c = new px2();
    public static final px2 d;

    static {
        u9c u9cVar = u9c.c;
        int i = chb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u9cVar.e(rze.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(u24.a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
