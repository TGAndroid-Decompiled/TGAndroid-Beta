package org.telegram.messenger;
public final class l3 implements Runnable {
    public final int f20559a;
    public final Throwable f20560b;

    public l3(int i10, Throwable th2) {
        this.f20559a = i10;
        this.f20560b = th2;
    }

    @Override
    public final void run() {
        switch (this.f20559a) {
            case 0:
                FileLog.d(this.f20560b);
                return;
            default:
                FileLog.h(this.f20560b);
                return;
        }
    }
}
