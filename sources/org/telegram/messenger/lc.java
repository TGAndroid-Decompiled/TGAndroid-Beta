package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f20849a;
    public final boolean[] f20850b;

    public lc(int i10, boolean[] zArr) {
        this.f20849a = i10;
        this.f20850b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20849a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f20850b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f20850b);
                return;
        }
    }
}
