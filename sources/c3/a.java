package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4366a;
    public final l f4367b;

    public a(ExecutorService executorService, l lVar) {
        this.f4366a = executorService;
        this.f4367b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4366a.execute(runnable);
    }
}
