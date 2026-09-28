package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16253a;
    public final Throwable f16254b;

    public e3(int i10, Throwable th2) {
        this.f16253a = i10;
        this.f16254b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16253a) {
            case 0:
                FileLog.h(this.f16254b);
                return;
            default:
                FileLog.b(this.f16254b);
                return;
        }
    }
}
