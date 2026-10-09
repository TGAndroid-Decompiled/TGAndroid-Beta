package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class k0 implements Runnable {
    private final TaskCompletionSource f364a;

    public k0() {
        this.f364a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f364a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f364a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public k0(TaskCompletionSource taskCompletionSource) {
        this.f364a = taskCompletionSource;
    }
}
