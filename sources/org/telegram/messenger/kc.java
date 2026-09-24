package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16810a;
    public final boolean[] f16811b;

    public kc(int i10, boolean[] zArr) {
        this.f16810a = i10;
        this.f16811b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16810a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16811b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16811b);
                return;
        }
    }
}
