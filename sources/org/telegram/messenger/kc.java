package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16804a;
    public final boolean[] f16805b;

    public kc(int i10, boolean[] zArr) {
        this.f16804a = i10;
        this.f16805b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16804a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16805b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16805b);
                return;
        }
    }
}
