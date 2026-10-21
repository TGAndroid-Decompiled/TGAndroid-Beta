package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19593a;
    public final boolean[] f19594b;

    public tc(int i10, boolean[] zArr) {
        this.f19593a = i10;
        this.f19594b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19593a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19594b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19594b);
                return;
        }
    }
}
