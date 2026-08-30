package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17841a;
    public final boolean[] f17842b;

    public mc(int i10, boolean[] zArr) {
        this.f17841a = i10;
        this.f17842b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17841a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f17842b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f17842b);
                return;
        }
    }
}
