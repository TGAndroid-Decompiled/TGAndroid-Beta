package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f18364a;
    public final boolean[] f18365b;

    public kc(int i10, boolean[] zArr) {
        this.f18364a = i10;
        this.f18365b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18364a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18365b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18365b);
                return;
        }
    }
}
