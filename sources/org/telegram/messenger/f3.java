package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f17181a;
    public final Throwable f17182b;

    public f3(int i10, Throwable th2) {
        this.f17181a = i10;
        this.f17182b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17181a) {
            case 0:
                FileLog.h(this.f17182b);
                return;
            default:
                FileLog.b(this.f17182b);
                return;
        }
    }
}
