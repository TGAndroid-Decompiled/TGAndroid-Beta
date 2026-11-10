package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class h0 implements Runnable {
    private final TaskCompletionSource f8243a;

    public h0() {
        this.f8243a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f8243a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f8243a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public h0(TaskCompletionSource taskCompletionSource) {
        this.f8243a = taskCompletionSource;
    }
}
