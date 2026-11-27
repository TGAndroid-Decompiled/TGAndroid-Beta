package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class i03 implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public Task c = Tasks.forResult(null);

    public i03(ExecutorService executorService) {
        this.a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.b) {
            continueWithTask = this.c.continueWithTask(this.a, new td(runnable, (byte) 6));
            this.c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(wy2 wy2Var) {
        Task continueWithTask;
        synchronized (this.b) {
            continueWithTask = this.c.continueWithTask(this.a, new ht2(wy2Var, (byte) 5));
            this.c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
