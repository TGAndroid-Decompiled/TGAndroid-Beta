package ba;

import aa.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3087a;
    public final Object f3088b = new Object();
    public Task f3089c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3087a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3088b) {
            continueWithTask = this.f3089c.continueWithTask(this.f3087a, new b(runnable));
            this.f3089c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(n nVar) {
        Task continueWithTask;
        synchronized (this.f3088b) {
            continueWithTask = this.f3089c.continueWithTask(this.f3087a, new a1.c(nVar, 9));
            this.f3089c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3087a.execute(runnable);
    }
}
