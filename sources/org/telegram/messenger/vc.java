package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19759a;
    public final boolean[] f19760b;

    public vc(int i10, boolean[] zArr) {
        this.f19759a = i10;
        this.f19760b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19759a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19760b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19760b);
                return;
        }
    }
}
