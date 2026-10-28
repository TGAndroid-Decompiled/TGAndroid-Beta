package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f9668a;
    public boolean f9669b;

    public i() {
        this(g0.f9663a);
    }

    public final synchronized void a() {
        while (!this.f9669b) {
            this.f9668a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f9669b) {
            try {
                this.f9668a.getClass();
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
            return this.f9669b;
        }
        this.f9668a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f9669b && elapsedRealtime < j11) {
                try {
                    this.f9668a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f9668a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f9669b;
    }

    public final synchronized void d() {
        this.f9669b = false;
    }

    public final synchronized boolean e() {
        if (this.f9669b) {
            return false;
        }
        this.f9669b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f9668a = g0Var;
    }
}
