package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class h0 implements Runnable {
    private final TaskCompletionSource f8238a;

    public h0() {
        this.f8238a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f8238a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f8238a;
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
        this.f8238a = taskCompletionSource;
    }
}
