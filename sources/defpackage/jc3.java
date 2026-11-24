package defpackage;

import java.util.concurrent.Executor;
public final class jc3 extends d64 implements Executor {
    public static final jc3 c = new fy2();
    public static final fy2 d;

    static {
        u7c u7cVar = u7c.c;
        int i = ifb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u7cVar.e(bxe.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(k34.a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
