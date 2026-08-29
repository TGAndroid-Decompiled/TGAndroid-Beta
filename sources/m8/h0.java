package m8;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class h0 implements Runnable {
    private final TaskCompletionSource f16911a;

    public h0() {
        this.f16911a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f16911a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f16911a;
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
        this.f16911a = taskCompletionSource;
    }
}
