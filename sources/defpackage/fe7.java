package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class fe7 implements Closeable, d16 {
    public static final ce3 e = new ce3("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final mg6 b;
    public final CancellationTokenSource c;
    public final Executor d;

    public fe7(mg6 mg6Var, Executor executor) {
        this.b = mg6Var;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        mg6Var.b.incrementAndGet();
        mg6Var.a(executor, mbd.a, cancellationTokenSource.getToken()).addOnFailureListener(i2f.f);
    }

    public final synchronized Task c(go5 go5Var) {
        if (this.a.get()) {
            return Tasks.forException(new be7("This detector is already closed!", 14));
        } else if (go5Var.b >= 32 && go5Var.c >= 32) {
            return this.b.a(this.d, new sga(this, go5Var), this.c.getToken());
        } else {
            return Tasks.forException(new be7("InputImage width and height should be at least 32!", 3));
        }
    }

    @Override
    @ep7(u06.ON_DESTROY)
    public synchronized void close() {
        if (!this.a.getAndSet(true)) {
            this.c.cancel();
            this.b.d(this.d);
        }
    }
}
