package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.j00 {
    public final Thread f22991c;
    public final ai.o d;
    public volatile boolean f22992e;
    public volatile int f22993f;
    public int f22994g;
    public volatile boolean f22995i;
    public final Object f22989a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f22990b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.o oVar) {
        boolean z10;
        this.d = oVar;
        r0 r0Var = r0.f26515f;
        if (r0Var.f26516a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22992e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f22991c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f22989a) {
            this.f22993f++;
            this.f22992e = false;
        }
        this.f22990b.removeMessages(1);
        this.f22991c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f22989a) {
            this.f22993f++;
            this.f22992e = true;
            this.f22995i = false;
            this.f22989a.notifyAll();
        }
        this.f22991c.interrupt();
    }
}
