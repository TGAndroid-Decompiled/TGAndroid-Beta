package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16570a;
    public final boolean[] f16571b;

    public kc(int i10, boolean[] zArr) {
        this.f16570a = i10;
        this.f16571b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16570a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16571b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16571b);
                return;
        }
    }
}
