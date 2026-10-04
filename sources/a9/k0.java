package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class k0 implements Runnable {
    private final TaskCompletionSource f366a;

    public k0() {
        this.f366a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f366a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f366a;
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
        this.f366a = taskCompletionSource;
    }
}
