package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4082a;
    public final l f4083b;

    public a(ExecutorService executorService, l lVar) {
        this.f4082a = executorService;
        this.f4083b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4082a.execute(runnable);
    }
}
