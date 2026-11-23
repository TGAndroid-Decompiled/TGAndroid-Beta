package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.l00 {
    public final Thread f22981c;
    public final ai.i d;
    public volatile boolean f22982e;
    public volatile int f22983f;
    public int f22984g;
    public volatile boolean f22985i;
    public final Object f22979a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f22980b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.i iVar) {
        boolean z10;
        this.d = iVar;
        r0 r0Var = r0.f26500f;
        if (r0Var.f26501a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22982e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f22981c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f22979a) {
            this.f22983f++;
            this.f22982e = false;
        }
        this.f22980b.removeMessages(1);
        this.f22981c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f22979a) {
            this.f22983f++;
            this.f22982e = true;
            this.f22985i = false;
            this.f22979a.notifyAll();
        }
        this.f22981c.interrupt();
    }
}
