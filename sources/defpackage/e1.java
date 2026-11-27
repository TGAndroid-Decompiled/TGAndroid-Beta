package defpackage;

import android.os.Looper;
public final class e1 implements io4 {
    public final Thread c;
    public final kc d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final d1 b = new d1(this, Looper.getMainLooper(), (byte) 0);

    public e1(kc kcVar) {
        boolean z;
        this.d = kcVar;
        vr vrVar = vr.f;
        if (vrVar.a > 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        vrVar.d.add(this);
        Thread thread = new Thread(new c1(this, (byte) 0), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.e = true;
            this.i = false;
            this.a.notifyAll();
        }
        this.c.interrupt();
    }
}
