package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f20052a;
    public final boolean[] f20053b;

    public wc(int i10, boolean[] zArr) {
        this.f20052a = i10;
        this.f20053b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20052a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f20053b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f20053b);
                return;
        }
    }
}
