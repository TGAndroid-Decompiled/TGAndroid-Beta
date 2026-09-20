package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16232a;
    public final Throwable f16233b;

    public e3(int i10, Throwable th2) {
        this.f16232a = i10;
        this.f16233b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16232a) {
            case 0:
                FileLog.h(this.f16233b);
                return;
            default:
                FileLog.b(this.f16233b);
                return;
        }
    }
}
