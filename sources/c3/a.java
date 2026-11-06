package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f5260a;
    public final l f5261b;

    public a(ExecutorService executorService, l lVar) {
        this.f5260a = executorService;
        this.f5261b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f5260a.execute(runnable);
    }
}
