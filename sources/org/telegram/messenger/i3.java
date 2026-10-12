package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f17461a;
    public final Throwable f17462b;

    public i3(int i10, Throwable th2) {
        this.f17461a = i10;
        this.f17462b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17461a) {
            case 0:
                FileLog.lambda$e$5(this.f17462b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17462b);
                return;
        }
    }
}
