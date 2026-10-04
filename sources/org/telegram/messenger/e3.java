package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17716a;
    public final Throwable f17717b;

    public e3(int i10, Throwable th2) {
        this.f17716a = i10;
        this.f17717b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17716a) {
            case 0:
                FileLog.h(this.f17717b);
                return;
            default:
                FileLog.b(this.f17717b);
                return;
        }
    }
}
