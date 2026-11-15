package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f13453a;
    public boolean f13454b;

    public i() {
        this(g0.f13448a);
    }

    public final synchronized void a() {
        while (!this.f13454b) {
            this.f13453a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f13454b) {
            try {
                this.f13453a.getClass();
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
            return this.f13454b;
        }
        this.f13453a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f13454b && elapsedRealtime < j10) {
                try {
                    this.f13453a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f13453a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f13454b;
    }

    public final synchronized void d() {
        this.f13454b = false;
    }

    public final synchronized boolean e() {
        if (this.f13454b) {
            return false;
        }
        this.f13454b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f13453a = g0Var;
    }
}
