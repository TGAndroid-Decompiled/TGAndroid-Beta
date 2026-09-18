package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16191a;
    public final Throwable f16192b;

    public e3(int i10, Throwable th2) {
        this.f16191a = i10;
        this.f16192b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16191a) {
            case 0:
                FileLog.h(this.f16192b);
                return;
            default:
                FileLog.b(this.f16192b);
                return;
        }
    }
}
