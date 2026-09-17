package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17555a;
    public final Throwable f17556b;

    public e3(int i10, Throwable th2) {
        this.f17555a = i10;
        this.f17556b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17555a) {
            case 0:
                FileLog.h(this.f17556b);
                return;
            default:
                FileLog.b(this.f17556b);
                return;
        }
    }
}
