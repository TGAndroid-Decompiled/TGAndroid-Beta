package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16254a;
    public final Throwable f16255b;

    public e3(int i10, Throwable th2) {
        this.f16254a = i10;
        this.f16255b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16254a) {
            case 0:
                FileLog.h(this.f16255b);
                return;
            default:
                FileLog.b(this.f16255b);
                return;
        }
    }
}
