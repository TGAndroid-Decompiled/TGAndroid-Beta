package org.telegram.messenger;
public final class m3 implements Runnable {
    public final int f20656a;
    public final Throwable f20657b;

    public m3(int i10, Throwable th2) {
        this.f20656a = i10;
        this.f20657b = th2;
    }

    @Override
    public final void run() {
        switch (this.f20656a) {
            case 0:
                FileLog.d(this.f20657b);
                return;
            default:
                FileLog.h(this.f20657b);
                return;
        }
    }
}
