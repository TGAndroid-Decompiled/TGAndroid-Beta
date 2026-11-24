package defpackage;

import android.os.Looper;
public final class d1 implements dm4 {
    public final Thread c;
    public final jc d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final c1 b = new c1(this, Looper.getMainLooper(), (byte) 0);

    public d1(jc jcVar) {
        boolean z;
        this.d = jcVar;
        ur urVar = ur.f;
        if (urVar.a > 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        urVar.d.add(this);
        Thread thread = new Thread(new b1(this, (byte) 0), "ANRDetector");
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
