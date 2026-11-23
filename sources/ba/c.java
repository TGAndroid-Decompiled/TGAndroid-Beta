package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3104a;
    public final Object f3105b = new Object();
    public Task f3106c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3104a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3105b) {
            continueWithTask = this.f3106c.continueWithTask(this.f3104a, new b(runnable));
            this.f3106c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3105b) {
            continueWithTask = this.f3106c.continueWithTask(this.f3104a, new a1.c(nVar, 10));
            this.f3106c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3104a.execute(runnable);
    }
}
