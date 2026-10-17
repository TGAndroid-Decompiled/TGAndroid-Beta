package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18564a;
    public final Throwable f18565b;

    public i3(int i10, Throwable th2) {
        this.f18564a = i10;
        this.f18565b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                FileLog.lambda$e$5(this.f18565b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18565b);
                return;
        }
    }
}
