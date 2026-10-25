package b9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class i0 implements Runnable {
    private final TaskCompletionSource f3702a;

    public i0() {
        this.f3702a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f3702a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f3702a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public i0(TaskCompletionSource taskCompletionSource) {
        this.f3702a = taskCompletionSource;
    }
}
