package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f9669a;
    public boolean f9670b;

    public i() {
        this(g0.f9664a);
    }

    public final synchronized void a() {
        while (!this.f9670b) {
            this.f9669a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f9670b) {
            try {
                this.f9669a.getClass();
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
            return this.f9670b;
        }
        this.f9669a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f9670b && elapsedRealtime < j11) {
                try {
                    this.f9669a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f9669a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f9670b;
    }

    public final synchronized void d() {
        this.f9670b = false;
    }

    public final synchronized boolean e() {
        if (this.f9670b) {
            return false;
        }
        this.f9670b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f9669a = g0Var;
    }
}
