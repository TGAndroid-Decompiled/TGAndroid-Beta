package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16574a;
    public final boolean[] f16575b;

    public kc(int i10, boolean[] zArr) {
        this.f16574a = i10;
        this.f16575b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16574a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16575b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16575b);
                return;
        }
    }
}
