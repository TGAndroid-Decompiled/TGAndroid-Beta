package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19989a;
    public final boolean[] f19990b;

    public wc(int i10, boolean[] zArr) {
        this.f19989a = i10;
        this.f19990b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19989a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19990b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19990b);
                return;
        }
    }
}
