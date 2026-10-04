package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17717a;
    public final Throwable f17718b;

    public e3(int i10, Throwable th2) {
        this.f17717a = i10;
        this.f17718b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17717a) {
            case 0:
                FileLog.h(this.f17718b);
                return;
            default:
                FileLog.b(this.f17718b);
                return;
        }
    }
}
