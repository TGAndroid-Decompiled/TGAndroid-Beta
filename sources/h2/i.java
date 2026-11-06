package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f14093a;
    public boolean f14094b;

    public i() {
        this(g0.f14088a);
    }

    public final synchronized void a() {
        while (!this.f14094b) {
            this.f14093a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z9 = false;
        while (!this.f14094b) {
            try {
                this.f14093a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j3) {
        if (j3 <= 0) {
            return this.f14094b;
        }
        this.f14093a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z9 = false;
            while (!this.f14094b && elapsedRealtime < j10) {
                try {
                    this.f14093a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z9 = true;
                }
                this.f14093a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f14094b;
    }

    public final synchronized void d() {
        this.f14094b = false;
    }

    public final synchronized boolean e() {
        if (this.f14094b) {
            return false;
        }
        this.f14094b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f14093a = g0Var;
    }
}
