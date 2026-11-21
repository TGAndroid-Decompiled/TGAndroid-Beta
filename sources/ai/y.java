package ai;

import android.os.ParcelFileDescriptor;
public final class y {
    public final ParcelFileDescriptor f1609a;
    public final ParcelFileDescriptor f1610b;
    public final Thread f1611c;
    public volatile int d;
    public volatile boolean f1612e;
    public final int f1613f;
    public final int f1614g;
    public final int h;
    public long f1615i;
    public final z f1616j;

    public y(z zVar, int i7, int i10, int i11) {
        this.f1616j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1609a = createPipe[0];
        this.f1610b = createPipe[1];
        this.d = i7;
        this.f1613f = i7;
        this.f1614g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 6), "DictationFeed");
        this.f1611c = thread;
        thread.start();
    }

    public final void a() {
        this.f1612e = true;
        synchronized (this.f1616j.f1635a) {
            this.f1616j.f1635a.notifyAll();
        }
        this.f1611c.interrupt();
        try {
            this.f1609a.close();
        } catch (Exception unused) {
        }
    }
}
