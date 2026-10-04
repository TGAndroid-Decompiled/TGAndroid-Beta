package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f18363a;
    public final boolean[] f18364b;

    public kc(int i10, boolean[] zArr) {
        this.f18363a = i10;
        this.f18364b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18364b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18364b);
                return;
        }
    }
}
