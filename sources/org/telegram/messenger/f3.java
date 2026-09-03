package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f18625a;
    public final Throwable f18626b;

    public f3(int i10, Throwable th2) {
        this.f18625a = i10;
        this.f18626b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18625a) {
            case 0:
                FileLog.h(this.f18626b);
                return;
            default:
                FileLog.b(this.f18626b);
                return;
        }
    }
}
