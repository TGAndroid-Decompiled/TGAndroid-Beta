package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.uz {
    public final Thread f21686c;
    public final ai.y1 d;
    public volatile boolean f21687e;
    public volatile int f21688f;
    public int f21689g;
    public volatile boolean f21690i;
    public final Object f21684a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f21685b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 5);

    public b(ai.y1 y1Var) {
        boolean z10;
        this.d = y1Var;
        r0 r0Var = r0.f25016f;
        if (r0Var.f25017a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21687e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f21686c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f21684a) {
            this.f21688f++;
            this.f21687e = false;
        }
        this.f21685b.removeMessages(1);
        this.f21686c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f21684a) {
            this.f21688f++;
            this.f21687e = true;
            this.f21690i = false;
            this.f21684a.notifyAll();
        }
        this.f21686c.interrupt();
    }
}
