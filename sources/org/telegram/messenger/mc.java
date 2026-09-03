package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f19363a;
    public final boolean[] f19364b;

    public mc(int i10, boolean[] zArr) {
        this.f19363a = i10;
        this.f19364b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f19364b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f19364b);
                return;
        }
    }
}
