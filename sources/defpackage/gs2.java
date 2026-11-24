package defpackage;

import android.os.SystemClock;
public final class gs2 {
    public final bfb a;
    public boolean b;

    public gs2() {
        this(bfb.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j <= 0) {
            return this.b;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            b();
        } else {
            boolean z = false;
            while (!this.b && elapsedRealtime < j2) {
                try {
                    this.a.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized void d() {
        this.b = false;
    }

    public final synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public gs2(bfb bfbVar) {
        this.a = bfbVar;
    }
}
