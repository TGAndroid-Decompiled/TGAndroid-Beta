package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.j00 {
    public final Thread f23102c;
    public final ai.k d;
    public volatile boolean f23103e;
    public volatile int f23104f;
    public int f23105g;
    public volatile boolean f23106i;
    public final Object f23100a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f23101b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.k kVar) {
        boolean z10;
        this.d = kVar;
        r0 r0Var = r0.f26613f;
        if (r0Var.f26614a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23103e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f23102c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f23100a) {
            this.f23104f++;
            this.f23103e = false;
        }
        this.f23101b.removeMessages(1);
        this.f23102c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f23100a) {
            this.f23104f++;
            this.f23103e = true;
            this.f23106i = false;
            this.f23100a.notifyAll();
        }
        this.f23102c.interrupt();
    }
}
