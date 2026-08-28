package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f20281a;
    public final boolean[] f20282b;

    public fc(int i9, boolean[] zArr) {
        this.f20281a = i9;
        this.f20282b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20281a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f20282b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f20282b);
                return;
        }
    }
}
