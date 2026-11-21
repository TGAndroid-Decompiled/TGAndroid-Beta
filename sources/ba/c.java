package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3097a;
    public final Object f3098b = new Object();
    public Task f3099c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3097a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3098b) {
            continueWithTask = this.f3099c.continueWithTask(this.f3097a, new b(runnable));
            this.f3099c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3098b) {
            continueWithTask = this.f3099c.continueWithTask(this.f3097a, new a1.c(nVar, 10));
            this.f3099c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3097a.execute(runnable);
    }
}
