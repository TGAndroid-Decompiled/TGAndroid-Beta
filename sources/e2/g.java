package e2;

import android.os.SystemClock;
public final class g {
    public final x f7203a;
    public boolean f7204b;

    public g() {
        this(x.f7240a);
    }

    public final synchronized void a() {
        while (!this.f7204b) {
            this.f7203a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f7204b) {
            try {
                this.f7203a.getClass();
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
            return this.f7204b;
        }
        this.f7203a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f7204b && elapsedRealtime < j10) {
                try {
                    this.f7203a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f7203a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f7204b;
    }

    public final synchronized void d() {
        this.f7204b = false;
    }

    public final synchronized boolean e() {
        if (this.f7204b) {
            return false;
        }
        this.f7204b = true;
        notifyAll();
        return true;
    }

    public g(x xVar) {
        this.f7203a = xVar;
    }
}
