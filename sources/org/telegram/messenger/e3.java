package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16240a;
    public final Throwable f16241b;

    public e3(int i10, Throwable th2) {
        this.f16240a = i10;
        this.f16241b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16240a) {
            case 0:
                FileLog.h(this.f16241b);
                return;
            default:
                FileLog.b(this.f16241b);
                return;
        }
    }
}
