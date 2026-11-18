package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3085a;
    public final Object f3086b = new Object();
    public Task f3087c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3085a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3086b) {
            continueWithTask = this.f3087c.continueWithTask(this.f3085a, new b(runnable));
            this.f3087c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3086b) {
            continueWithTask = this.f3087c.continueWithTask(this.f3085a, new a1.c(nVar, 9));
            this.f3087c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3085a.execute(runnable);
    }
}
