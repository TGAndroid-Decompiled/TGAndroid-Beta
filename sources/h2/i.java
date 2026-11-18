package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f13768a;
    public boolean f13769b;

    public i() {
        this(g0.f13763a);
    }

    public final synchronized void a() {
        while (!this.f13769b) {
            this.f13768a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f13769b) {
            try {
                this.f13768a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j3) {
        if (j3 <= 0) {
            return this.f13769b;
        }
        this.f13768a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f13769b && elapsedRealtime < j10) {
                try {
                    this.f13768a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f13768a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f13769b;
    }

    public final synchronized void d() {
        this.f13769b = false;
    }

    public final synchronized boolean e() {
        if (this.f13769b) {
            return false;
        }
        this.f13769b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f13768a = g0Var;
    }
}
