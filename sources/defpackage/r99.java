package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class r99 implements Executor {
    public final ExecutorService a;
    public final lq5 b;

    public r99(ExecutorService executorService, lq5 lq5Var) {
        this.a = executorService;
        this.b = lq5Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
