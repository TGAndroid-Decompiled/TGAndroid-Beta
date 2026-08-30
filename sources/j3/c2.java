package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
public final class c2 {
    public final b2 f8452a;
    public final k0 f8453b;
    public final h5.y f8454c;
    public int d;
    public Object e;
    public final Looper f8455f;
    public boolean f8456g;
    public boolean h;
    public boolean f8457i;

    public c2(k0 k0Var, b2 b2Var, o2 o2Var, int i10, h5.y yVar, Looper looper) {
        this.f8453b = k0Var;
        this.f8452a = b2Var;
        this.f8455f = looper;
        this.f8454c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z4;
        boolean z10;
        h5.a.i(this.f8456g);
        if (this.f8455f.getThread() != Thread.currentThread()) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        this.f8454c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f8457i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f8454c.getClass();
            wait(j10);
            this.f8454c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.h = z4 | this.h;
        this.f8457i = true;
        notifyAll();
    }

    public final void c() {
        h5.a.i(!this.f8456g);
        this.f8456g = true;
        k0 k0Var = this.f8453b;
        synchronized (k0Var) {
            if (!k0Var.L && k0Var.f8653s.getThread().isAlive()) {
                k0Var.f8651n.a(14, this).b();
                return;
            }
            h5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
