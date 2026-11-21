package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4392a;
    public final l f4393b;

    public a(ExecutorService executorService, l lVar) {
        this.f4392a = executorService;
        this.f4393b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4392a.execute(runnable);
    }
}
