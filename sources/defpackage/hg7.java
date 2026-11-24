package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class hg7 implements Closeable, d36 {
    public static final s13 e = new s13("MobileVisionBase", "", (byte) 1);
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final mi6 b;
    public final CancellationTokenSource c;
    public final Executor d;

    public hg7(mi6 mi6Var, Executor executor) {
        this.b = mi6Var;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        mi6Var.b.incrementAndGet();
        mi6Var.a(executor, odd.a, cancellationTokenSource.getToken()).addOnFailureListener(k4f.f);
    }

    public final synchronized Task c(gq5 gq5Var) {
        if (this.a.get()) {
            return Tasks.forException(new dg7("This detector is already closed!", 14));
        } else if (gq5Var.b >= 32 && gq5Var.c >= 32) {
            return this.b.a(this.d, new uia(this, gq5Var), this.c.getToken());
        } else {
            return Tasks.forException(new dg7("InputImage width and height should be at least 32!", 3));
        }
    }

    @Override
    @hr7(u26.ON_DESTROY)
    public synchronized void close() {
        if (!this.a.getAndSet(true)) {
            this.c.cancel();
            this.b.d(this.d);
        }
    }
}
