package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f21225a;
    public final boolean[] f21226b;

    public sc(int i10, boolean[] zArr) {
        this.f21225a = i10;
        this.f21226b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f21225a) {
            case 0:
                MessagesController.lambda$openByUserName$461(this.f21226b);
                return;
            default:
                MessagesController.lambda$openApp$502(this.f21226b);
                return;
        }
    }
}
