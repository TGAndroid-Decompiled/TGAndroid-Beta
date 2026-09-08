package org.telegram.messenger;
public final class kc implements Runnable {
    public final int f18185a;
    public final boolean[] f18186b;

    public kc(int i10, boolean[] zArr) {
        this.f18185a = i10;
        this.f18186b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18185a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18186b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18186b);
                return;
        }
    }
}
