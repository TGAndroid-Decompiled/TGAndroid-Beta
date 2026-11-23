package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f13760a;
    public boolean f13761b;

    public i() {
        this(g0.f13755a);
    }

    public final synchronized void a() {
        while (!this.f13761b) {
            this.f13760a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f13761b) {
            try {
                this.f13760a.getClass();
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
            return this.f13761b;
        }
        this.f13760a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f13761b && elapsedRealtime < j10) {
                try {
                    this.f13760a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f13760a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f13761b;
    }

    public final synchronized void d() {
        this.f13761b = false;
    }

    public final synchronized boolean e() {
        if (this.f13761b) {
            return false;
        }
        this.f13761b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f13760a = g0Var;
    }
}
