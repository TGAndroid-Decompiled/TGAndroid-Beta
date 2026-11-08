package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.zz {
    public final Thread f21581c;
    public final ai.m0 d;
    public volatile boolean f21582e;
    public volatile int f21583f;
    public int f21584g;
    public volatile boolean f21585i;
    public final Object f21579a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f21580b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.m0 m0Var) {
        boolean z9;
        this.d = m0Var;
        r0 r0Var = r0.f25186f;
        if (r0Var.f25187a > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21582e = z9;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f21581c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f21579a) {
            this.f21583f++;
            this.f21582e = false;
        }
        this.f21580b.removeMessages(1);
        this.f21581c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f21579a) {
            this.f21583f++;
            this.f21582e = true;
            this.f21585i = false;
            this.f21579a.notifyAll();
        }
        this.f21581c.interrupt();
    }
}
