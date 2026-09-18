package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f16760a;
    public final boolean[] f16761b;

    public kc(int i10, boolean[] zArr) {
        this.f16760a = i10;
        this.f16761b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16760a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16761b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16761b);
                return;
        }
    }
}
