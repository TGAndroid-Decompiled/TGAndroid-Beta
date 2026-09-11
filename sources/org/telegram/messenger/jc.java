package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18086a;
    public final boolean[] f18087b;

    public jc(int i10, boolean[] zArr) {
        this.f18086a = i10;
        this.f18087b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18086a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f18087b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f18087b);
                return;
        }
    }
}
