package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f13765a;
    public boolean f13766b;

    public i() {
        this(g0.f13760a);
    }

    public final synchronized void a() {
        while (!this.f13766b) {
            this.f13765a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f13766b) {
            try {
                this.f13765a.getClass();
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
            return this.f13766b;
        }
        this.f13765a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f13766b && elapsedRealtime < j10) {
                try {
                    this.f13765a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f13765a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f13766b;
    }

    public final synchronized void d() {
        this.f13766b = false;
    }

    public final synchronized boolean e() {
        if (this.f13766b) {
            return false;
        }
        this.f13766b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f13765a = g0Var;
    }
}
