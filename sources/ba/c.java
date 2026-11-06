package ba;

import aa.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class c implements Executor {
    public final ExecutorService f3132a;
    public final Object f3133b = new Object();
    public Task f3134c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f3132a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f3133b) {
            continueWithTask = this.f3134c.continueWithTask(this.f3132a, new b(runnable));
            this.f3134c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(o oVar) {
        Task continueWithTask;
        synchronized (this.f3133b) {
            continueWithTask = this.f3134c.continueWithTask(this.f3132a, new a1.c(oVar, 8));
            this.f3134c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f3132a.execute(runnable);
    }
}
