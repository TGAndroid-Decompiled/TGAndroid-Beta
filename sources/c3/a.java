package c3;

import a3.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f4358a;
    public final l f4359b;

    public a(ExecutorService executorService, l lVar) {
        this.f4358a = executorService;
        this.f4359b = lVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f4358a.execute(runnable);
    }
}
