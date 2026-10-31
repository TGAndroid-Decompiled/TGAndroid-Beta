package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f6148a;
    public boolean f6149b;

    public i() {
        this(g0.f6143a);
    }

    public final synchronized void a() {
        while (!this.f6149b) {
            this.f6148a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f6149b) {
            try {
                this.f6148a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j10) {
        if (j10 <= 0) {
            return this.f6149b;
        }
        this.f6148a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f6149b && elapsedRealtime < j11) {
                try {
                    this.f6148a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f6148a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f6149b;
    }

    public final synchronized void d() {
        this.f6149b = false;
    }

    public final synchronized boolean e() {
        if (this.f6149b) {
            return false;
        }
        this.f6149b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f6148a = g0Var;
    }
}
