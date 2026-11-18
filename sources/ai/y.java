package ai;

import android.os.ParcelFileDescriptor;
public final class y {
    public final ParcelFileDescriptor f1616a;
    public final ParcelFileDescriptor f1617b;
    public final Thread f1618c;
    public volatile int d;
    public volatile boolean f1619e;
    public final int f1620f;
    public final int f1621g;
    public final int h;
    public long f1622i;
    public final z f1623j;

    public y(z zVar, int i7, int i10, int i11) {
        this.f1623j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1616a = createPipe[0];
        this.f1617b = createPipe[1];
        this.d = i7;
        this.f1620f = i7;
        this.f1621g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 6), "DictationFeed");
        this.f1618c = thread;
        thread.start();
    }

    public final void a() {
        this.f1619e = true;
        synchronized (this.f1623j.f1628a) {
            this.f1623j.f1628a.notifyAll();
        }
        this.f1618c.interrupt();
        try {
            this.f1616a.close();
        } catch (Exception unused) {
        }
    }
}
