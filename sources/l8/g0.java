package l8;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class g0 implements Runnable {

    private final TaskCompletionSource f15469a;

    public g0() {
        this.f15469a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f15469a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f15469a;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e9) {
            a(e9);
        }
    }

    public g0(TaskCompletionSource taskCompletionSource) {
        this.f15469a = taskCompletionSource;
    }
}
