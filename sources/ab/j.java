package ab;

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
    public final m f315a;
    public final AtomicInteger f316b = new AtomicInteger(0);
    public final AtomicBoolean f317c = new AtomicBoolean(false);

    public j() {
        ?? obj = new Object();
        obj.f325b = new Object();
        obj.f326c = new ArrayDeque();
        obj.d = new AtomicReference();
        this.f315a = obj;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        boolean z10;
        if (this.f316b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.k(z10);
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
                } catch (RuntimeException e10) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e10);
                    }
                    throw e10;
                }
            }
        };
        this.f315a.t(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                j jVar = j.this;
                AtomicBoolean atomicBoolean = jVar.f317c;
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
                    } catch (RuntimeException e10) {
                        throw new wa.a("Internal error has occurred when executing ML Kit tasks", e10);
                    }
                } catch (Exception e11) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e11);
                    }
                }
            }
        }, executor2);
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        boolean z10;
        if (this.f316b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.k(z10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f315a.t(new o(2, this, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
