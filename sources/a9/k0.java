package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class k0 implements Runnable {
    private final TaskCompletionSource f337a;

    public k0() {
        this.f337a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f337a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f337a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public k0(TaskCompletionSource taskCompletionSource) {
        this.f337a = taskCompletionSource;
    }
}
