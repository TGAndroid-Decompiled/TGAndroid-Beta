package ai;

import android.os.ParcelFileDescriptor;
public final class y {
    public final ParcelFileDescriptor f1624a;
    public final ParcelFileDescriptor f1625b;
    public final Thread f1626c;
    public volatile int d;
    public volatile boolean f1627e;
    public final int f1628f;
    public final int f1629g;
    public final int h;
    public long f1630i;
    public final z f1631j;

    public y(z zVar, int i7, int i10, int i11) {
        this.f1631j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1624a = createPipe[0];
        this.f1625b = createPipe[1];
        this.d = i7;
        this.f1628f = i7;
        this.f1629g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 5), "DictationFeed");
        this.f1626c = thread;
        thread.start();
    }

    public final void a() {
        this.f1627e = true;
        synchronized (this.f1631j.f1636a) {
            this.f1631j.f1636a.notifyAll();
        }
        this.f1626c.interrupt();
        try {
            this.f1624a.close();
        } catch (Exception unused) {
        }
    }
}
