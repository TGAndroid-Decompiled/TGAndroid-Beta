package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16270a;
    public final Throwable f16271b;

    public e3(int i10, Throwable th2) {
        this.f16270a = i10;
        this.f16271b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16270a) {
            case 0:
                FileLog.h(this.f16271b);
                return;
            default:
                FileLog.b(this.f16271b);
                return;
        }
    }
}
