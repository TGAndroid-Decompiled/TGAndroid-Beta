package e2;

import android.os.SystemClock;
public final class g {
    public final x f8753a;
    public boolean f8754b;

    public g() {
        this(x.f8795a);
    }

    public final synchronized void a() {
        while (!this.f8754b) {
            this.f8753a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8754b) {
            try {
                this.f8753a.getClass();
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
            return this.f8754b;
        }
        this.f8753a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8754b && elapsedRealtime < j10) {
                try {
                    this.f8753a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8753a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8754b;
    }

    public final synchronized void d() {
        this.f8754b = false;
    }

    public final synchronized boolean e() {
        if (this.f8754b) {
            return false;
        }
        this.f8754b = true;
        notifyAll();
        return true;
    }

    public g(x xVar) {
        this.f8753a = xVar;
    }
}
