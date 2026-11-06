package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.yz {
    public final Thread f21557c;
    public final ai.m0 d;
    public volatile boolean f21558e;
    public volatile int f21559f;
    public int f21560g;
    public volatile boolean f21561i;
    public final Object f21555a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f21556b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.m0 m0Var) {
        boolean z9;
        this.d = m0Var;
        r0 r0Var = r0.f25173f;
        if (r0Var.f25174a > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21558e = z9;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f21557c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f21555a) {
            this.f21559f++;
            this.f21558e = false;
        }
        this.f21556b.removeMessages(1);
        this.f21557c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f21555a) {
            this.f21559f++;
            this.f21558e = true;
            this.f21561i = false;
            this.f21555a.notifyAll();
        }
        this.f21557c.interrupt();
    }
}
