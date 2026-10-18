package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18570a;
    public final Throwable f18571b;

    public i3(int i10, Throwable th2) {
        this.f18570a = i10;
        this.f18571b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18570a) {
            case 0:
                FileLog.lambda$e$5(this.f18571b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18571b);
                return;
        }
    }
}
