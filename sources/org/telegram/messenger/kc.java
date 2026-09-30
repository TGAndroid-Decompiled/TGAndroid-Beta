package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16843a;
    public final boolean[] f16844b;

    public kc(int i10, boolean[] zArr) {
        this.f16843a = i10;
        this.f16844b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16843a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16844b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16844b);
                return;
        }
    }
}
