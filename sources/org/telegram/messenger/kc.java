package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16825a;
    public final boolean[] f16826b;

    public kc(int i10, boolean[] zArr) {
        this.f16825a = i10;
        this.f16826b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16825a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16826b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16826b);
                return;
        }
    }
}
