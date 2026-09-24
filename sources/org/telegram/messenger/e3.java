package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16231a;
    public final Throwable f16232b;

    public e3(int i10, Throwable th2) {
        this.f16231a = i10;
        this.f16232b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16231a) {
            case 0:
                FileLog.h(this.f16232b);
                return;
            default:
                FileLog.b(this.f16232b);
                return;
        }
    }
}
