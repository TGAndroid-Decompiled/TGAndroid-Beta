package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f15992a;
    public final Throwable f15993b;

    public e3(int i10, Throwable th2) {
        this.f15992a = i10;
        this.f15993b = th2;
    }

    @Override
    public final void run() {
        switch (this.f15992a) {
            case 0:
                FileLog.h(this.f15993b);
                return;
            default:
                FileLog.b(this.f15993b);
                return;
        }
    }
}
