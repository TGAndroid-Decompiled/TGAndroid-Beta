package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class u2d implements Runnable {
    private final TaskCompletionSource a;

    public u2d() {
        this.a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public u2d(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
