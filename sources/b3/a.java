package b3;

import a3.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final Executor f2343a;
    public final j f2344b;

    public a(ExecutorService executorService, j jVar) {
        this.f2343a = executorService;
        this.f2344b = jVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f2343a.execute(runnable);
    }
}
