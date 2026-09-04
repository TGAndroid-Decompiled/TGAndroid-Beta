package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f18158a;
    public final boolean[] f18159b;

    public kc(int i10, boolean[] zArr) {
        this.f18158a = i10;
        this.f18159b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18158a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18159b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18159b);
                return;
        }
    }
}
