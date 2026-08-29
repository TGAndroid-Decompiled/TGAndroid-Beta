package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
public final class e2 {
    public final d2 f10420a;
    public final q0 f10421b;
    public final f5.y f10422c;
    public int d;
    public Object f10423e;
    public final Looper f10424f;
    public boolean f10425g;
    public boolean h;
    public boolean f10426i;

    public e2(q0 q0Var, d2 d2Var, r2 r2Var, int i10, f5.y yVar, Looper looper) {
        this.f10421b = q0Var;
        this.f10420a = d2Var;
        this.f10424f = looper;
        this.f10422c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        boolean z11;
        f5.a.i(this.f10425g);
        if (this.f10424f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        this.f10422c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z11 = this.f10426i;
            if (z11 || j10 <= 0) {
                break;
            }
            this.f10422c.getClass();
            wait(j10);
            this.f10422c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.h = z10 | this.h;
        this.f10426i = true;
        notifyAll();
    }

    public final void c() {
        f5.a.i(!this.f10425g);
        this.f10425g = true;
        q0 q0Var = this.f10421b;
        synchronized (q0Var) {
            if (!q0Var.K && q0Var.f10688s.getThread().isAlive()) {
                q0Var.f10686n.a(14, this).b();
                return;
            }
            f5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
