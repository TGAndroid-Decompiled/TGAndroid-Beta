package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f8236a;
    public boolean f8237b;

    public i() {
        this(g0.f8231a);
    }

    public final synchronized void a() {
        while (!this.f8237b) {
            this.f8236a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8237b) {
            try {
                this.f8236a.getClass();
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
            return this.f8237b;
        }
        this.f8236a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8237b && elapsedRealtime < j11) {
                try {
                    this.f8236a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8236a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8237b;
    }

    public final synchronized void d() {
        this.f8237b = false;
    }

    public final synchronized boolean e() {
        if (this.f8237b) {
            return false;
        }
        this.f8237b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f8236a = g0Var;
    }
}
