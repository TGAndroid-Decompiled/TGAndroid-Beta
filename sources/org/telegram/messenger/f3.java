package org.telegram.messenger;

public final class f3 implements Runnable {

    public final int f20215a;

    public final Throwable f20216b;

    public f3(int i10, Throwable th) {
        this.f20215a = i10;
        this.f20216b = th;
    }

    @Override
    public final void run() {
        switch (this.f20215a) {
            case 0:
                FileLog.lambda$e$4(this.f20216b);
                break;
            default:
                FileLog.lambda$fatal$5(this.f20216b);
                break;
        }
    }
}
