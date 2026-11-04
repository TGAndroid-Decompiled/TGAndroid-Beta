package g2;

import android.os.SystemClock;
public final class j {
    public final h0 f11854a;
    public boolean f11855b;

    public j() {
        this(h0.f11849a);
    }

    public final synchronized void a() {
        while (!this.f11855b) {
            this.f11854a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f11855b) {
            try {
                this.f11854a.getClass();
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
            return this.f11855b;
        }
        this.f11854a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f11855b && elapsedRealtime < j11) {
                try {
                    this.f11854a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f11854a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f11855b;
    }

    public final synchronized void d() {
        this.f11855b = false;
    }

    public final synchronized boolean e() {
        if (this.f11855b) {
            return false;
        }
        this.f11855b = true;
        notifyAll();
        return true;
    }

    public j(h0 h0Var) {
        this.f11854a = h0Var;
    }
}
