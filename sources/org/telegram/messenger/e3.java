package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16246a;
    public final Throwable f16247b;

    public e3(int i10, Throwable th2) {
        this.f16246a = i10;
        this.f16247b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16246a) {
            case 0:
                FileLog.h(this.f16247b);
                return;
            default:
                FileLog.b(this.f16247b);
                return;
        }
    }
}
