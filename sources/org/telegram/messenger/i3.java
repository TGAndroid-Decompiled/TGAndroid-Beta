package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18575a;
    public final Throwable f18576b;

    public i3(int i10, Throwable th2) {
        this.f18575a = i10;
        this.f18576b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18575a) {
            case 0:
                FileLog.lambda$e$5(this.f18576b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18576b);
                return;
        }
    }
}
