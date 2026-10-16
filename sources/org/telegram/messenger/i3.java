package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f17157a;
    public final Throwable f17158b;

    public i3(int i10, Throwable th2) {
        this.f17157a = i10;
        this.f17158b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17157a) {
            case 0:
                FileLog.lambda$e$5(this.f17158b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17158b);
                return;
        }
    }
}
