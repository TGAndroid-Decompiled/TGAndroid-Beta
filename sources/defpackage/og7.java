package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class og7 implements Closeable, h36 {
    public static final j5 e = new j5("MobileVisionBase", "", (byte) 2);
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final qi6 b;
    public final CancellationTokenSource c;
    public final Executor d;

    public og7(qi6 qi6Var, Executor executor) {
        this.b = qi6Var;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        qi6Var.b.incrementAndGet();
        qi6Var.a(executor, fgd.a, cancellationTokenSource.getToken()).addOnFailureListener(z6f.f);
    }

    public final synchronized Task c(jq5 jq5Var) {
        if (this.a.get()) {
            return Tasks.forException(new kg7("This detector is already closed!", 14));
        } else if (jq5Var.b >= 32 && jq5Var.c >= 32) {
            return this.b.a(this.d, new lka(this, jq5Var), this.c.getToken());
        } else {
            return Tasks.forException(new kg7("InputImage width and height should be at least 32!", 3));
        }
    }

    @Override
    @es7(y26.ON_DESTROY)
    public synchronized void close() {
        if (!this.a.getAndSet(true)) {
            this.c.cancel();
            this.b.d(this.d);
        }
    }
}
