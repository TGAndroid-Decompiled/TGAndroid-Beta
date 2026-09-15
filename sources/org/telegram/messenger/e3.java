package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16004a;
    public final Throwable f16005b;

    public e3(int i10, Throwable th2) {
        this.f16004a = i10;
        this.f16005b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16004a) {
            case 0:
                FileLog.h(this.f16005b);
                return;
            default:
                FileLog.b(this.f16005b);
                return;
        }
    }
}
