package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f17161a;
    public final Throwable f17162b;

    public f3(int i10, Throwable th2) {
        this.f17161a = i10;
        this.f17162b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17161a) {
            case 0:
                FileLog.h(this.f17162b);
                return;
            default:
                FileLog.b(this.f17162b);
                return;
        }
    }
}
