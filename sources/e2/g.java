package e2;

import android.os.SystemClock;
public final class g {
    public final x f7887a;
    public boolean f7888b;

    public g() {
        this(x.f7924a);
    }

    public final synchronized void a() {
        while (!this.f7888b) {
            this.f7887a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f7888b) {
            try {
                this.f7887a.getClass();
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
            return this.f7888b;
        }
        this.f7887a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f7888b && elapsedRealtime < j10) {
                try {
                    this.f7887a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f7887a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f7888b;
    }

    public final synchronized void d() {
        this.f7888b = false;
    }

    public final synchronized boolean e() {
        if (this.f7888b) {
            return false;
        }
        this.f7888b = true;
        notifyAll();
        return true;
    }

    public g(x xVar) {
        this.f7887a = xVar;
    }
}
