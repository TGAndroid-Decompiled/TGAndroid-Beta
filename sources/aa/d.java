package aa;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z9.k;
public final class d implements Executor {
    public final ExecutorService f282a;
    public final Object f283b = new Object();
    public Task f284c = Tasks.forResult(null);

    public d(ExecutorService executorService) {
        this.f282a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f283b) {
            continueWithTask = this.f284c.continueWithTask(this.f282a, new c(runnable));
            this.f284c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(k kVar) {
        Task continueWithTask;
        synchronized (this.f283b) {
            continueWithTask = this.f284c.continueWithTask(this.f282a, new a1.c(kVar, 1));
            this.f284c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f282a.execute(runnable);
    }
}
