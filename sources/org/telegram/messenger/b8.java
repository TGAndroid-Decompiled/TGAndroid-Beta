package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15954a;
    public final MediaDataController f15955b;
    public final String f15956c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15954a = i10;
        this.f15955b = mediaDataController;
        this.f15956c = str;
    }

    @Override
    public final void run() {
        switch (this.f15954a) {
            case 0:
                MediaDataController.F2(this.f15955b, this.f15956c);
                return;
            case 1:
                MediaDataController.u3(this.f15955b, this.f15956c);
                return;
            case 2:
                MediaDataController.k3(this.f15955b, this.f15956c);
                return;
            case 3:
                MediaDataController.S1(this.f15955b, this.f15956c);
                return;
            case 4:
                MediaDataController.o(this.f15955b, this.f15956c);
                return;
            case 5:
                MediaDataController.m1(this.f15955b, this.f15956c);
                return;
            default:
                MediaDataController.q1(this.f15955b, this.f15956c);
                return;
        }
    }
}
