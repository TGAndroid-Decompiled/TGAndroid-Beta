package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f18623a;
    public final Throwable f18624b;

    public f3(int i10, Throwable th2) {
        this.f18623a = i10;
        this.f18624b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18623a) {
            case 0:
                FileLog.h(this.f18624b);
                return;
            default:
                FileLog.b(this.f18624b);
                return;
        }
    }
}
