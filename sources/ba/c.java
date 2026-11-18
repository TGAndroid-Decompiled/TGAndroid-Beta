package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3084a;
    public final Object f3085b = new Object();
    public Task f3086c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3084a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3085b) {
            continueWithTask = this.f3086c.continueWithTask(this.f3084a, new b(runnable));
            this.f3086c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3085b) {
            continueWithTask = this.f3086c.continueWithTask(this.f3084a, new a1.c(nVar, 9));
            this.f3086c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3084a.execute(runnable);
    }
}
