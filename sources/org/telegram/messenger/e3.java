package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16013a;
    public final Throwable f16014b;

    public e3(int i10, Throwable th2) {
        this.f16013a = i10;
        this.f16014b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16013a) {
            case 0:
                FileLog.h(this.f16014b);
                return;
            default:
                FileLog.b(this.f16014b);
                return;
        }
    }
}
