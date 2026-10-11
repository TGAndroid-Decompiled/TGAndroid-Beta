package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f17841a;
    public final Throwable f17842b;

    public f3(int i10, Throwable th2) {
        this.f17841a = i10;
        this.f17842b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17841a) {
            case 0:
                FileLog.lambda$e$5(this.f17842b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17842b);
                return;
        }
    }
}
