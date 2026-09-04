package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17515a;
    public final Throwable f17516b;

    public e3(int i10, Throwable th2) {
        this.f17515a = i10;
        this.f17516b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17515a) {
            case 0:
                FileLog.h(this.f17516b);
                return;
            default:
                FileLog.b(this.f17516b);
                return;
        }
    }
}
