package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f18553a;
    public final MediaDataController f18554b;
    public final String f18555c;

    public e8(MediaDataController mediaDataController, String str, int i10) {
        this.f18553a = i10;
        this.f18554b = mediaDataController;
        this.f18555c = str;
    }

    @Override
    public final void run() {
        switch (this.f18553a) {
            case 0:
                MediaDataController.F2(this.f18554b, this.f18555c);
                return;
            case 1:
                MediaDataController.u3(this.f18554b, this.f18555c);
                return;
            case 2:
                MediaDataController.k3(this.f18554b, this.f18555c);
                return;
            case 3:
                MediaDataController.S1(this.f18554b, this.f18555c);
                return;
            case 4:
                MediaDataController.o(this.f18554b, this.f18555c);
                return;
            case 5:
                MediaDataController.m1(this.f18554b, this.f18555c);
                return;
            default:
                MediaDataController.q1(this.f18554b, this.f18555c);
                return;
        }
    }
}
