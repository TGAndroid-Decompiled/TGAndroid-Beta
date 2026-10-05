package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17722a;
    public final Throwable f17723b;

    public e3(int i10, Throwable th2) {
        this.f17722a = i10;
        this.f17723b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17722a) {
            case 0:
                FileLog.h(this.f17723b);
                return;
            default:
                FileLog.b(this.f17723b);
                return;
        }
    }
}
