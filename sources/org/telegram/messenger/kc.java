package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f18359a;
    public final boolean[] f18360b;

    public kc(int i10, boolean[] zArr) {
        this.f18359a = i10;
        this.f18360b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18359a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18360b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18360b);
                return;
        }
    }
}
