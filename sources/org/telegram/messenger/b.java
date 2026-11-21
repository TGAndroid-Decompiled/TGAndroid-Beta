package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.l00 {
    public final Thread f23019c;
    public final ai.n d;
    public volatile boolean f23020e;
    public volatile int f23021f;
    public int f23022g;
    public volatile boolean f23023i;
    public final Object f23017a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f23018b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.n nVar) {
        boolean z10;
        this.d = nVar;
        r0 r0Var = r0.f26543f;
        if (r0Var.f26544a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23020e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f23019c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f23017a) {
            this.f23021f++;
            this.f23020e = false;
        }
        this.f23018b.removeMessages(1);
        this.f23019c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f23017a) {
            this.f23021f++;
            this.f23020e = true;
            this.f23023i = false;
            this.f23017a.notifyAll();
        }
        this.f23019c.interrupt();
    }
}
