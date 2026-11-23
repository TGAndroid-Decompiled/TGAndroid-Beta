package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.l00 {
    public final Thread f23017c;
    public final ai.n d;
    public volatile boolean f23018e;
    public volatile int f23019f;
    public int f23020g;
    public volatile boolean f23021i;
    public final Object f23015a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f23016b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.n nVar) {
        boolean z10;
        this.d = nVar;
        r0 r0Var = r0.f26536f;
        if (r0Var.f26537a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23018e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f23017c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f23015a) {
            this.f23019f++;
            this.f23018e = false;
        }
        this.f23016b.removeMessages(1);
        this.f23017c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f23015a) {
            this.f23019f++;
            this.f23018e = true;
            this.f23021i = false;
            this.f23015a.notifyAll();
        }
        this.f23017c.interrupt();
    }
}
