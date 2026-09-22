package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16819a;
    public final boolean[] f16820b;

    public kc(int i10, boolean[] zArr) {
        this.f16819a = i10;
        this.f16820b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16819a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16820b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16820b);
                return;
        }
    }
}
