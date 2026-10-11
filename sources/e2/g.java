package e2;

import android.os.SystemClock;
public final class g {
    public final x f8547a;
    public boolean f8548b;

    public g() {
        this(x.f8589a);
    }

    public final synchronized void a() {
        while (!this.f8548b) {
            this.f8547a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8548b) {
            try {
                this.f8547a.getClass();
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
            return this.f8548b;
        }
        this.f8547a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8548b && elapsedRealtime < j10) {
                try {
                    this.f8547a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8547a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8548b;
    }

    public final synchronized void d() {
        this.f8548b = false;
    }

    public final synchronized boolean e() {
        if (this.f8548b) {
            return false;
        }
        this.f8548b = true;
        notifyAll();
        return true;
    }

    public g(x xVar) {
        this.f8547a = xVar;
    }
}
