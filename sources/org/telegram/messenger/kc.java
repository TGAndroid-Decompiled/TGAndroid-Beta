package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16571a;
    public final boolean[] f16572b;

    public kc(int i10, boolean[] zArr) {
        this.f16571a = i10;
        this.f16572b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16571a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16572b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16572b);
                return;
        }
    }
}
