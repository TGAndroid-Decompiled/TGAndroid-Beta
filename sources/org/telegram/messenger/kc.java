package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16820a;
    public final boolean[] f16821b;

    public kc(int i10, boolean[] zArr) {
        this.f16820a = i10;
        this.f16821b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16820a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16821b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16821b);
                return;
        }
    }
}
