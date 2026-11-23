package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4395a;
    public final l f4396b;

    public a(ExecutorService executorService, l lVar) {
        this.f4395a = executorService;
        this.f4396b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4395a.execute(runnable);
    }
}
