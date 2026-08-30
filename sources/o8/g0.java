package o8;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class g0 implements Runnable {
    private final TaskCompletionSource f16484a;

    public g0() {
        this.f16484a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f16484a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f16484a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public g0(TaskCompletionSource taskCompletionSource) {
        this.f16484a = taskCompletionSource;
    }
}
