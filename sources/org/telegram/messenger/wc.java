package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f18623a;
    public final boolean[] f18624b;

    public wc(int i10, boolean[] zArr) {
        this.f18623a = i10;
        this.f18624b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18623a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f18624b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f18624b);
                return;
        }
    }
}
