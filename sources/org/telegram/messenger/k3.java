package org.telegram.messenger;
public final class k3 implements Runnable {
    public final int f18746a;
    public final Throwable f18747b;

    public k3(int i10, Throwable th2) {
        this.f18746a = i10;
        this.f18747b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                FileLog.lambda$e$5(this.f18747b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18747b);
                return;
        }
    }
}
