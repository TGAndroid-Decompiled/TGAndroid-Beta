package h3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
public final class e2 {
    public final d2 f9384a;
    public final q0 f9385b;
    public final d5.a0 f9386c;
    public int d;
    public Object f9387e;
    public final Looper f9388f;
    public boolean f9389g;
    public boolean h;
    public boolean f9390i;

    public e2(q0 q0Var, d2 d2Var, r2 r2Var, int i9, d5.a0 a0Var, Looper looper) {
        this.f9385b = q0Var;
        this.f9384a = d2Var;
        this.f9388f = looper;
        this.f9386c = a0Var;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        boolean z11;
        d5.a.i(this.f9389g);
        if (this.f9388f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        this.f9386c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z11 = this.f9390i;
            if (z11 || j10 <= 0) {
                break;
            }
            this.f9386c.getClass();
            wait(j10);
            this.f9386c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.h = z10 | this.h;
        this.f9390i = true;
        notifyAll();
    }

    public final void c() {
        d5.a.i(!this.f9389g);
        this.f9389g = true;
        q0 q0Var = this.f9385b;
        synchronized (q0Var) {
            if (!q0Var.K && q0Var.f9651s.getThread().isAlive()) {
                q0Var.f9649n.a(14, this).b();
                return;
            }
            d5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
