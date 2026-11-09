package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f5258a;
    public final l f5259b;

    public a(ExecutorService executorService, l lVar) {
        this.f5258a = executorService;
        this.f5259b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f5258a.execute(runnable);
    }
}
