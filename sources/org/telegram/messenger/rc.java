package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f19422a;
    public final boolean[] f19423b;

    public rc(int i10, boolean[] zArr) {
        this.f19422a = i10;
        this.f19423b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19422a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19423b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19423b);
                return;
        }
    }
}
