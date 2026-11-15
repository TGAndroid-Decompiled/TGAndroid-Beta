package ai;

import android.os.ParcelFileDescriptor;
public final class x {
    public final ParcelFileDescriptor f1612a;
    public final ParcelFileDescriptor f1613b;
    public final Thread f1614c;
    public volatile int d;
    public volatile boolean f1615e;
    public final int f1616f;
    public final int f1617g;
    public final int h;
    public long f1618i;
    public final y f1619j;

    public x(y yVar, int i7, int i10, int i11) {
        this.f1619j = yVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1612a = createPipe[0];
        this.f1613b = createPipe[1];
        this.d = i7;
        this.f1616f = i7;
        this.f1617g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 5), "DictationFeed");
        this.f1614c = thread;
        thread.start();
    }

    public final void a() {
        this.f1615e = true;
        synchronized (this.f1619j.f1624a) {
            this.f1619j.f1624a.notifyAll();
        }
        this.f1614c.interrupt();
        try {
            this.f1612a.close();
        } catch (Exception unused) {
        }
    }
}
