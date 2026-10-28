package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f21106a;
    public final boolean[] f21107b;

    public rc(int i10, boolean[] zArr) {
        this.f21106a = i10;
        this.f21107b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f21106a) {
            case 0:
                MessagesController.lambda$openByUserName$462(this.f21107b);
                return;
            default:
                MessagesController.lambda$openApp$503(this.f21107b);
                return;
        }
    }
}
