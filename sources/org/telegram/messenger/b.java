package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.yz {
    public final Thread f21586c;
    public final ai.m0 d;
    public volatile boolean f21587e;
    public volatile int f21588f;
    public int f21589g;
    public volatile boolean f21590i;
    public final Object f21584a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f21585b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.m0 m0Var) {
        boolean z9;
        this.d = m0Var;
        r0 r0Var = r0.f25190f;
        if (r0Var.f25191a > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21587e = z9;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f21586c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f21584a) {
            this.f21588f++;
            this.f21587e = false;
        }
        this.f21585b.removeMessages(1);
        this.f21586c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f21584a) {
            this.f21588f++;
            this.f21587e = true;
            this.f21590i = false;
            this.f21584a.notifyAll();
        }
        this.f21586c.interrupt();
    }
}
