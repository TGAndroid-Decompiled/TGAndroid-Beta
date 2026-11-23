package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class h0 implements Runnable {
    private final TaskCompletionSource f7941a;

    public h0() {
        this.f7941a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f7941a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f7941a;
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
        this.f7941a = taskCompletionSource;
    }
}
