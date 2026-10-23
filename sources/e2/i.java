package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f8241a;
    public boolean f8242b;

    public i() {
        this(g0.f8236a);
    }

    public final synchronized void a() {
        while (!this.f8242b) {
            this.f8241a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8242b) {
            try {
                this.f8241a.getClass();
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
            return this.f8242b;
        }
        this.f8241a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8242b && elapsedRealtime < j11) {
                try {
                    this.f8241a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8241a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8242b;
    }

    public final synchronized void d() {
        this.f8242b = false;
    }

    public final synchronized boolean e() {
        if (this.f8242b) {
            return false;
        }
        this.f8242b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f8241a = g0Var;
    }
}
