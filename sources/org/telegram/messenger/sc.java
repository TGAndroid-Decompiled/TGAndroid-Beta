package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f19499a;
    public final boolean[] f19500b;

    public sc(int i10, boolean[] zArr) {
        this.f19499a = i10;
        this.f19500b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19499a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19500b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19500b);
                return;
        }
    }
}
