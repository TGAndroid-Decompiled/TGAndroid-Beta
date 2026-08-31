package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
public final class c2 {
    public final b2 f9012a;
    public final k0 f9013b;
    public final h5.y f9014c;
    public int d;
    public Object f9015e;
    public final Looper f9016f;
    public boolean f9017g;
    public boolean h;
    public boolean f9018i;

    public c2(k0 k0Var, b2 b2Var, o2 o2Var, int i10, h5.y yVar, Looper looper) {
        this.f9013b = k0Var;
        this.f9012a = b2Var;
        this.f9016f = looper;
        this.f9014c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z4;
        boolean z10;
        h5.a.i(this.f9017g);
        if (this.f9016f.getThread() != Thread.currentThread()) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        this.f9014c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f9018i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f9014c.getClass();
            wait(j10);
            this.f9014c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.h = z4 | this.h;
        this.f9018i = true;
        notifyAll();
    }

    public final void c() {
        h5.a.i(!this.f9017g);
        this.f9017g = true;
        k0 k0Var = this.f9013b;
        synchronized (k0Var) {
            if (!k0Var.L && k0Var.f9231s.getThread().isAlive()) {
                k0Var.f9229n.a(14, this).b();
                return;
            }
            h5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
