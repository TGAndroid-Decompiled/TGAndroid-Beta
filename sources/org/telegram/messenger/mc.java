package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f19361a;
    public final boolean[] f19362b;

    public mc(int i10, boolean[] zArr) {
        this.f19361a = i10;
        this.f19362b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19361a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f19362b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f19362b);
                return;
        }
    }
}
