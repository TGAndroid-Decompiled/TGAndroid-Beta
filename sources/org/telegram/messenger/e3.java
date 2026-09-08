package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17542a;
    public final Throwable f17543b;

    public e3(int i10, Throwable th2) {
        this.f17542a = i10;
        this.f17543b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                FileLog.h(this.f17543b);
                return;
            default:
                FileLog.b(this.f17543b);
                return;
        }
    }
}
