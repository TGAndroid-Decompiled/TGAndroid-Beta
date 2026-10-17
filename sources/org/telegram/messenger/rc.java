package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f19419a;
    public final boolean[] f19420b;

    public rc(int i10, boolean[] zArr) {
        this.f19419a = i10;
        this.f19420b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19419a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19420b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19420b);
                return;
        }
    }
}
