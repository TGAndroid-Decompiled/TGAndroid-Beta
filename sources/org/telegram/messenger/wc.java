package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19466a;
    public final boolean[] f19467b;

    public wc(int i10, boolean[] zArr) {
        this.f19466a = i10;
        this.f19467b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19466a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19467b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19467b);
                return;
        }
    }
}
