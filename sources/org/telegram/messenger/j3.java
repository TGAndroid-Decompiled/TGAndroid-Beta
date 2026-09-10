package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f15497a;
    public final Throwable f15498b;

    public j3(int i10, Throwable th2) {
        this.f15497a = i10;
        this.f15498b = th2;
    }

    @Override
    public final void run() {
        switch (this.f15497a) {
            case 0:
                FileLog.lambda$e$4(this.f15498b);
                return;
            default:
                FileLog.lambda$fatal$5(this.f15498b);
                return;
        }
    }
}
