package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16827a;
    public final boolean[] f16828b;

    public kc(int i10, boolean[] zArr) {
        this.f16827a = i10;
        this.f16828b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16827a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16828b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16828b);
                return;
        }
    }
}
