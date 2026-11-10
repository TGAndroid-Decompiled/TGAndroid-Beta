package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f5263a;
    public final l f5264b;

    public a(ExecutorService executorService, l lVar) {
        this.f5263a = executorService;
        this.f5264b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f5263a.execute(runnable);
    }
}
