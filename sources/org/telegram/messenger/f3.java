package org.telegram.messenger;
public final class f3 implements Runnable {
    public final int f17805a;
    public final Throwable f17806b;

    public f3(int i10, Throwable th2) {
        this.f17805a = i10;
        this.f17806b = th2;
    }

    @Override
    public final void run() {
        switch (this.f17805a) {
            case 0:
                FileLog.lambda$e$5(this.f17806b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f17806b);
                return;
        }
    }
}
