package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f17112a;
    public final MediaDataController f17113b;
    public final String f17114c;

    public e8(MediaDataController mediaDataController, String str, int i10) {
        this.f17112a = i10;
        this.f17113b = mediaDataController;
        this.f17114c = str;
    }

    @Override
    public final void run() {
        switch (this.f17112a) {
            case 0:
                MediaDataController.F2(this.f17113b, this.f17114c);
                return;
            case 1:
                MediaDataController.u3(this.f17113b, this.f17114c);
                return;
            case 2:
                MediaDataController.k3(this.f17113b, this.f17114c);
                return;
            case 3:
                MediaDataController.S1(this.f17113b, this.f17114c);
                return;
            case 4:
                MediaDataController.o(this.f17113b, this.f17114c);
                return;
            case 5:
                MediaDataController.m1(this.f17113b, this.f17114c);
                return;
            default:
                MediaDataController.q1(this.f17113b, this.f17114c);
                return;
        }
    }
}
