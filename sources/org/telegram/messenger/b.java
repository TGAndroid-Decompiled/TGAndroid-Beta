package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.m00 {
    public final Thread f14695c;
    public final ag.f3 d;
    public volatile boolean e;
    public volatile int f14696f;
    public int f14697g;
    public volatile boolean f14698i;
    public final Object f14693a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f14694b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 9);

    public b(ag.f3 f3Var) {
        boolean z10;
        this.d = f3Var;
        u0 u0Var = u0.f18205f;
        if (u0Var.f18206a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        u0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f14695c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f14693a) {
            this.f14696f++;
            this.e = false;
        }
        this.f14694b.removeMessages(1);
        this.f14695c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f14693a) {
            this.f14696f++;
            this.e = true;
            this.f14698i = false;
            this.f14693a.notifyAll();
        }
        this.f14695c.interrupt();
    }
}
