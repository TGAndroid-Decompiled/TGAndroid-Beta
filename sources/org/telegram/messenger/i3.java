package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f17840a;
    public final Throwable f17841b;

    public i3(int i10, Throwable th2) {
        this.f17840a = i10;
        this.f17841b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17840a) {
            case 0:
                FileLog.lambda$e$5(this.f17841b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17841b);
                return;
        }
    }
}
