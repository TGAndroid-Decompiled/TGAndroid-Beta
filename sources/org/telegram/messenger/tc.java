package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19243a;
    public final boolean[] f19244b;

    public tc(int i10, boolean[] zArr) {
        this.f19243a = i10;
        this.f19244b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19243a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19244b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19244b);
                return;
        }
    }
}
