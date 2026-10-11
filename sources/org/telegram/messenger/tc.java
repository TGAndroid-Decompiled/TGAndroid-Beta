package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19279a;
    public final boolean[] f19280b;

    public tc(int i10, boolean[] zArr) {
        this.f19279a = i10;
        this.f19280b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19279a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19280b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19280b);
                return;
        }
    }
}
