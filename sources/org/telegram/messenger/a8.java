package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17142a;
    public final MediaDataController f17143b;
    public final String f17144c;

    public a8(MediaDataController mediaDataController, String str, int i10) {
        this.f17142a = i10;
        this.f17143b = mediaDataController;
        this.f17144c = str;
    }

    @Override
    public final void run() {
        switch (this.f17142a) {
            case 0:
                MediaDataController.F2(this.f17143b, this.f17144c);
                return;
            case 1:
                MediaDataController.u3(this.f17143b, this.f17144c);
                return;
            case 2:
                MediaDataController.k3(this.f17143b, this.f17144c);
                return;
            case 3:
                MediaDataController.S1(this.f17143b, this.f17144c);
                return;
            case 4:
                MediaDataController.o(this.f17143b, this.f17144c);
                return;
            case 5:
                MediaDataController.m1(this.f17143b, this.f17144c);
                return;
            default:
                MediaDataController.q1(this.f17143b, this.f17144c);
                return;
        }
    }
}
