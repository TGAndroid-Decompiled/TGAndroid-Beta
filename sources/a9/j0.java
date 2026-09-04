package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class j0 implements Runnable {
    private final TaskCompletionSource f351a;

    public j0() {
        this.f351a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f351a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f351a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public j0(TaskCompletionSource taskCompletionSource) {
        this.f351a = taskCompletionSource;
    }
}
