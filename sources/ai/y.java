package ai;

import android.os.ParcelFileDescriptor;
public final class y {
    public final ParcelFileDescriptor f1615a;
    public final ParcelFileDescriptor f1616b;
    public final Thread f1617c;
    public volatile int d;
    public volatile boolean f1618e;
    public final int f1619f;
    public final int f1620g;
    public final int h;
    public long f1621i;
    public final z f1622j;

    public y(z zVar, int i7, int i10, int i11) {
        this.f1622j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f1615a = createPipe[0];
        this.f1616b = createPipe[1];
        this.d = i7;
        this.f1619f = i7;
        this.f1620g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 6), "DictationFeed");
        this.f1617c = thread;
        thread.start();
    }

    public final void a() {
        this.f1618e = true;
        synchronized (this.f1622j.f1627a) {
            this.f1622j.f1627a.notifyAll();
        }
        this.f1617c.interrupt();
        try {
            this.f1615a.close();
        } catch (Exception unused) {
        }
    }
}
