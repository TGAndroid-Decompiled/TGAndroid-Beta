package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class e69 implements Executor {
    public final ExecutorService a;
    public final w26 b;

    public e69(ExecutorService executorService, w26 w26Var) {
        this.a = executorService;
        this.b = w26Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
