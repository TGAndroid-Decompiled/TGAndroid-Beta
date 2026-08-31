package cb;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
public abstract class j {
    public final m f2415a;
    public final AtomicInteger f2416b = new AtomicInteger(0);
    public final AtomicBoolean f2417c = new AtomicBoolean(false);

    public j() {
        ?? obj = new Object();
        obj.f2425b = new Object();
        obj.f2426c = new ArrayDeque();
        obj.d = new AtomicReference();
        this.f2415a = obj;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        boolean z4;
        if (this.f2416b.get() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.k(z4);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        Executor executor2 = new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e6) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e6);
                    }
                    throw e6;
                }
            }
        };
        this.f2415a.w(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                j jVar = j.this;
                AtomicBoolean atomicBoolean = jVar.f2417c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean isCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (isCancellationRequested) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            jVar.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object call = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(call);
                        }
                    } catch (RuntimeException e6) {
                        throw new ya.a("Internal error has occurred when executing ML Kit tasks", e6);
                    }
                } catch (Exception e10) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e10);
                    }
                }
            }
        }, executor2);
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        boolean z4;
        if (this.f2416b.get() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.k(z4);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2415a.w(new androidx.biometric.k(this, taskCompletionSource, false, 3), executor);
        taskCompletionSource.getTask();
    }
}
