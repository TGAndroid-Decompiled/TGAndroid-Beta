package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16826a;
    public final boolean[] f16827b;

    public kc(int i10, boolean[] zArr) {
        this.f16826a = i10;
        this.f16827b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16826a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16827b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16827b);
                return;
        }
    }
}
