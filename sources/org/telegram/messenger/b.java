package org.telegram.messenger;

import android.os.Looper;
public final class b implements org.telegram.ui.Components.c00 {
    public final Thread f22628c;
    public final ai.o d;
    public volatile boolean f22629e;
    public volatile int f22630f;
    public int f22631g;
    public volatile boolean f22632i;
    public final Object f22626a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q f22627b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.o oVar) {
        boolean z10;
        this.d = oVar;
        r0 r0Var = r0.f26183f;
        if (r0Var.f26184a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22629e = z10;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.f22628c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.f22626a) {
            this.f22630f++;
            this.f22629e = false;
        }
        this.f22627b.removeMessages(1);
        this.f22628c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.f22626a) {
            this.f22630f++;
            this.f22629e = true;
            this.f22632i = false;
            this.f22626a.notifyAll();
        }
        this.f22628c.interrupt();
    }
}
