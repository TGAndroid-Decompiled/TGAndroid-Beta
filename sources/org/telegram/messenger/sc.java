package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f19502a;
    public final boolean[] f19503b;

    public sc(int i10, boolean[] zArr) {
        this.f19502a = i10;
        this.f19503b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19502a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19503b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19503b);
                return;
        }
    }
}
