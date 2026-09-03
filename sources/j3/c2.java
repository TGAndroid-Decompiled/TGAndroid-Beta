package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
public final class c2 {
    public final b2 f8434a;
    public final k0 f8435b;
    public final h5.y f8436c;
    public int d;
    public Object e;
    public final Looper f8437f;
    public boolean f8438g;
    public boolean h;
    public boolean f8439i;

    public c2(k0 k0Var, b2 b2Var, o2 o2Var, int i10, h5.y yVar, Looper looper) {
        this.f8435b = k0Var;
        this.f8434a = b2Var;
        this.f8437f = looper;
        this.f8436c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z4;
        boolean z10;
        h5.a.i(this.f8438g);
        if (this.f8437f.getThread() != Thread.currentThread()) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        this.f8436c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f8439i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f8436c.getClass();
            wait(j10);
            this.f8436c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.h = z4 | this.h;
        this.f8439i = true;
        notifyAll();
    }

    public final void c() {
        h5.a.i(!this.f8438g);
        this.f8438g = true;
        k0 k0Var = this.f8435b;
        synchronized (k0Var) {
            if (!k0Var.L && k0Var.f8635s.getThread().isAlive()) {
                k0Var.f8633n.a(14, this).b();
                return;
            }
            h5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
