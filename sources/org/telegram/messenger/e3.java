package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f16001a;
    public final Throwable f16002b;

    public e3(int i10, Throwable th2) {
        this.f16001a = i10;
        this.f16002b = th2;
    }

    @Override
    public final void run() {
        switch (this.f16001a) {
            case 0:
                FileLog.h(this.f16002b);
                return;
            default:
                FileLog.b(this.f16002b);
                return;
        }
    }
}
