package e2;

import android.os.SystemClock;
public final class i {
    public final g0 f8235a;
    public boolean f8236b;

    public i() {
        this(g0.f8230a);
    }

    public final synchronized void a() {
        while (!this.f8236b) {
            this.f8235a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f8236b) {
            try {
                this.f8235a.getClass();
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
            return this.f8236b;
        }
        this.f8235a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        if (j11 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f8236b && elapsedRealtime < j11) {
                try {
                    this.f8235a.getClass();
                    wait(j11 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f8235a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f8236b;
    }

    public final synchronized void d() {
        this.f8236b = false;
    }

    public final synchronized boolean e() {
        if (this.f8236b) {
            return false;
        }
        this.f8236b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.f8235a = g0Var;
    }
}
