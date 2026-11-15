package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4085a;
    public final l f4086b;

    public a(ExecutorService executorService, l lVar) {
        this.f4085a = executorService;
        this.f4086b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4085a.execute(runnable);
    }
}
