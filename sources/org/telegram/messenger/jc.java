package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18113a;
    public final boolean[] f18114b;

    public jc(int i10, boolean[] zArr) {
        this.f18113a = i10;
        this.f18114b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18113a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18114b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18114b);
                return;
        }
    }
}
