package org.telegram.messenger;
public final class k3 implements Runnable {
    public final int f18745a;
    public final Throwable f18746b;

    public k3(int i10, Throwable th2) {
        this.f18745a = i10;
        this.f18746b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18745a) {
            case 0:
                FileLog.lambda$e$5(this.f18746b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18746b);
                return;
        }
    }
}
