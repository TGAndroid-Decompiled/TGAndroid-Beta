package h3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class e2 {

    public final d2 f7813a;

    public final q0 f7814b;

    public final d5.b0 f7815c;
    public int d;

    public Object f7816e;

    public final Looper f7817f;

    public boolean f7818g;
    public boolean h;

    public boolean f7819i;

    public e2(q0 q0Var, d2 d2Var, s2 s2Var, int i10, d5.b0 b0Var, Looper looper) {
        this.f7814b = q0Var;
        this.f7813a = d2Var;
        this.f7817f = looper;
        this.f7815c = b0Var;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        d5.a.i(this.f7818g);
        d5.a.i(this.f7817f.getThread() != Thread.currentThread());
        this.f7815c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f7819i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f7815c.getClass();
            wait(j10);
            this.f7815c.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.h = z10 | this.h;
        this.f7819i = true;
        notifyAll();
    }

    public final void c() {
        d5.a.i(!this.f7818g);
        this.f7818g = true;
        q0 q0Var = this.f7814b;
        synchronized (q0Var) {
            if (!q0Var.K && q0Var.f8081s.getThread().isAlive()) {
                q0Var.f8079n.a(14, this).b();
                return;
            }
            d5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
