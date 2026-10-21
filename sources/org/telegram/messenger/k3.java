package org.telegram.messenger;
public final class k3 implements Runnable {
    public final int f18744a;
    public final Throwable f18745b;

    public k3(int i10, Throwable th2) {
        this.f18744a = i10;
        this.f18745b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18744a) {
            case 0:
                FileLog.d(this.f18745b);
                return;
            default:
                FileLog.h(this.f18745b);
                return;
        }
    }
}
