package h2;

import android.os.SystemClock;
public final class i {
    public final g0 f14095a;
    public boolean f14096b;

    public i() {
        this(g0.f14090a);
    }

    public final synchronized void a() {
        while (!this.f14096b) {
            this.f14095a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z9 = false;
        while (!this.f14096b) {
            try {
                this.f14095a.getClass();
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
            return this.f14096b;
        }
        this.f14095a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z9 = false;
            while (!this.f14096b && elapsedRealtime < j10) {
                try {
                    this.f14095a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z9 = true;
                }
                this.f14095a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f14096b;
    }

    public final synchronized void d() {
        this.f14096b = false;
    }

    public final synchronized boolean e() {
        if (this.f14096b) {
            return false;
        }
        this.f14096b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f14095a = g0Var;
    }
}
