package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f20090a;
    public final Throwable f20091b;

    public e3(int i10, Throwable th2) {
        this.f20090a = i10;
        this.f20091b = th2;
    }

    @Override
    public final void run() {
        switch (this.f20090a) {
            case 0:
                FileLog.h(this.f20091b);
                return;
            default:
                FileLog.b(this.f20091b);
                return;
        }
    }
}
