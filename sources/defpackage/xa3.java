package defpackage;

import java.util.concurrent.Executor;
public final class xa3 extends s44 implements Executor {
    public static final xa3 c = new vw2();
    public static final vw2 d;

    static {
        u5c u5cVar = u5c.c;
        int i = hdb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u5cVar.e(zue.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(z14.a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
