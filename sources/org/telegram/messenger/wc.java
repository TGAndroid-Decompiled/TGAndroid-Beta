package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19465a;
    public final boolean[] f19466b;

    public wc(int i10, boolean[] zArr) {
        this.f19465a = i10;
        this.f19466b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19466b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19466b);
                return;
        }
    }
}
