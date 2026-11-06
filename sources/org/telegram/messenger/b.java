package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.yz {
    public final Thread f21556c;
    public final ai.m0 d;
    public volatile boolean f21557e;
    public volatile int f21558f;
    public int f21559g;
    public volatile boolean f21560i;
    public final Object f21554a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f21555b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.m0 m0Var) {
        boolean z9;
        this.d = m0Var;
        r0 r0Var = r0.f25165f;
        if (r0Var.f25166a > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21557e = z9;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f21556c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f21554a) {
            this.f21558f++;
            this.f21557e = false;
        }
        this.f21555b.removeMessages(1);
        this.f21556c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f21554a) {
            this.f21558f++;
            this.f21557e = true;
            this.f21560i = false;
            this.f21554a.notifyAll();
        }
        this.f21556c.interrupt();
    }
}
