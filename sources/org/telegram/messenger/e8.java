package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f17097a;
    public final MediaDataController f17098b;
    public final String f17099c;

    public e8(MediaDataController mediaDataController, String str, int i10) {
        this.f17097a = i10;
        this.f17098b = mediaDataController;
        this.f17099c = str;
    }

    @Override
    public final void run() {
        switch (this.f17097a) {
            case 0:
                MediaDataController.F2(this.f17098b, this.f17099c);
                return;
            case 1:
                MediaDataController.u3(this.f17098b, this.f17099c);
                return;
            case 2:
                MediaDataController.k3(this.f17098b, this.f17099c);
                return;
            case 3:
                MediaDataController.S1(this.f17098b, this.f17099c);
                return;
            case 4:
                MediaDataController.o(this.f17098b, this.f17099c);
                return;
            case 5:
                MediaDataController.m1(this.f17098b, this.f17099c);
                return;
            default:
                MediaDataController.q1(this.f17098b, this.f17099c);
                return;
        }
    }
}
