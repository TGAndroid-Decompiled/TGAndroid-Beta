package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19237a;
    public final boolean[] f19238b;

    public tc(int i10, boolean[] zArr) {
        this.f19237a = i10;
        this.f19238b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19237a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19238b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19238b);
                return;
        }
    }
}
