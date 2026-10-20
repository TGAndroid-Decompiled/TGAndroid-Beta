package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19594a;
    public final boolean[] f19595b;

    public tc(int i10, boolean[] zArr) {
        this.f19594a = i10;
        this.f19595b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19594a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19595b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19595b);
                return;
        }
    }
}
