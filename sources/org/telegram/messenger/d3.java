package org.telegram.messenger;
public final class d3 implements Runnable {
    public final int f20044a;
    public final Throwable f20045b;

    public d3(int i9, Throwable th) {
        this.f20044a = i9;
        this.f20045b = th;
    }

    @Override
    public final void run() {
        switch (this.f20044a) {
            case 0:
                FileLog.h(this.f20045b);
                return;
            default:
                FileLog.b(this.f20045b);
                return;
        }
    }
}
