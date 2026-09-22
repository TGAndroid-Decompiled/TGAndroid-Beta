package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16247a;
    public final Throwable f16248b;

    public e3(int i10, Throwable th2) {
        this.f16247a = i10;
        this.f16248b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16247a) {
            case 0:
                FileLog.h(this.f16248b);
                return;
            default:
                FileLog.b(this.f16248b);
                return;
        }
    }
}
