package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17821a;
    public final boolean[] f17822b;

    public mc(int i10, boolean[] zArr) {
        this.f17821a = i10;
        this.f17822b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f17822b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f17822b);
                return;
        }
    }
}
