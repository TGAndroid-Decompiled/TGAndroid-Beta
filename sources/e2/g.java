package e2;

import android.os.SystemClock;
public final class g {
    public final x f8548a;
    public boolean f8549b;

    public g() {
        this(x.f8590a);
    }

    public final synchronized void a() {
        while (!this.f8549b) {
            this.f8548a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8549b) {
            try {
                this.f8548a.getClass();
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
            return this.f8549b;
        }
        this.f8548a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8549b && elapsedRealtime < j10) {
                try {
                    this.f8548a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8548a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8549b;
    }

    public final synchronized void d() {
        this.f8549b = false;
    }

    public final synchronized boolean e() {
        if (this.f8549b) {
            return false;
        }
        this.f8549b = true;
        notifyAll();
        return true;
    }

    public g(x xVar) {
        this.f8548a = xVar;
    }
}
