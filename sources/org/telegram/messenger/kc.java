package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16583a;
    public final boolean[] f16584b;

    public kc(int i10, boolean[] zArr) {
        this.f16583a = i10;
        this.f16584b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16583a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16584b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16584b);
                return;
        }
    }
}
