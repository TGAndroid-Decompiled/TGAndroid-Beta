package org.telegram.messenger;
public final class k3 implements Runnable {
    public final int f18813a;
    public final Throwable f18814b;

    public k3(int i10, Throwable th2) {
        this.f18813a = i10;
        this.f18814b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18813a) {
            case 0:
                FileLog.lambda$e$5(this.f18814b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18814b);
                return;
        }
    }
}
