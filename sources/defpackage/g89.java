package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class g89 implements Executor {
    public final ExecutorService a;
    public final u36 b;

    public g89(ExecutorService executorService, u36 u36Var) {
        this.a = executorService;
        this.b = u36Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
