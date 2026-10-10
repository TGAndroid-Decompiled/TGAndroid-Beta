package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19241a;
    public final boolean[] f19242b;

    public tc(int i10, boolean[] zArr) {
        this.f19241a = i10;
        this.f19242b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19241a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19242b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19242b);
                return;
        }
    }
}
