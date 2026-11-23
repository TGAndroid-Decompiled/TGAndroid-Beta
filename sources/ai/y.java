package ai;

import android.os.ParcelFileDescriptor;
public final class y {
    public final ParcelFileDescriptor f1619a;
    public final ParcelFileDescriptor f1620b;
    public final Thread f1621c;
    public volatile int d;
    public volatile boolean f1622e;
    public final int f1623f;
    public final int f1624g;
    public final int h;
    public long f1625i;
    public final z f1626j;

    public y(z zVar, int i7, int i10, int i11) {
        this.f1626j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1619a = createPipe[0];
        this.f1620b = createPipe[1];
        this.d = i7;
        this.f1623f = i7;
        this.f1624g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 6), "DictationFeed");
        this.f1621c = thread;
        thread.start();
    }

    public final void a() {
        this.f1622e = true;
        synchronized (this.f1626j.f1636a) {
            this.f1626j.f1636a.notifyAll();
        }
        this.f1621c.interrupt();
        try {
            this.f1619a.close();
        } catch (Exception unused) {
        }
    }
}
