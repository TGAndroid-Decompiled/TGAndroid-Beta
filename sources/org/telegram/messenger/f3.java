package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f17802a;
    public final Throwable f17803b;

    public f3(int i10, Throwable th2) {
        this.f17802a = i10;
        this.f17803b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17802a) {
            case 0:
                FileLog.lambda$e$5(this.f17803b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17803b);
                return;
        }
    }
}
