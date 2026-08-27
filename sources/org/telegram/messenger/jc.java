package org.telegram.messenger;

public final class jc implements Runnable {

    public final int f20669a;

    public final boolean[] f20670b;

    public jc(int i10, boolean[] zArr) {
        this.f20669a = i10;
        this.f20670b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20669a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f20670b);
                break;
            default:
                MessagesController.lambda$openApp$497(this.f20670b);
                break;
        }
    }
}
