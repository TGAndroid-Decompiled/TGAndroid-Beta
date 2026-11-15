package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3090a;
    public final Object f3091b = new Object();
    public Task f3092c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3090a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3091b) {
            continueWithTask = this.f3092c.continueWithTask(this.f3090a, new b(runnable));
            this.f3092c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3091b) {
            continueWithTask = this.f3092c.continueWithTask(this.f3090a, new a1.c(nVar, 9));
            this.f3092c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3090a.execute(runnable);
    }
}
