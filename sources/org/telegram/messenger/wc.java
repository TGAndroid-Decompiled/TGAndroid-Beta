package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f18923a;
    public final boolean[] f18924b;

    public wc(int i10, boolean[] zArr) {
        this.f18923a = i10;
        this.f18924b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18923a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f18924b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f18924b);
                return;
        }
    }
}
