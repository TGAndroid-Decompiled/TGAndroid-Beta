package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.j00 {
    public final Thread f22994c;
    public final ai.o d;
    public volatile boolean f22995e;
    public volatile int f22996f;
    public int f22997g;
    public volatile boolean f22998i;
    public final Object f22992a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f22993b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.o oVar) {
        boolean z10;
        this.d = oVar;
        r0 r0Var = r0.f26517f;
        if (r0Var.f26518a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22995e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f22994c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f22992a) {
            this.f22996f++;
            this.f22995e = false;
        }
        this.f22993b.removeMessages(1);
        this.f22994c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f22992a) {
            this.f22996f++;
            this.f22995e = true;
            this.f22998i = false;
            this.f22992a.notifyAll();
        }
        this.f22994c.interrupt();
    }
}
