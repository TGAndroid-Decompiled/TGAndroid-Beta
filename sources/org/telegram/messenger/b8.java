package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15916a;
    public final MediaDataController f15917b;
    public final String f15918c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15916a = i10;
        this.f15917b = mediaDataController;
        this.f15918c = str;
    }

    @Override
    public final void run() {
        switch (this.f15916a) {
            case 0:
                MediaDataController.F2(this.f15917b, this.f15918c);
                return;
            case 1:
                MediaDataController.u3(this.f15917b, this.f15918c);
                return;
            case 2:
                MediaDataController.k3(this.f15917b, this.f15918c);
                return;
            case 3:
                MediaDataController.S1(this.f15917b, this.f15918c);
                return;
            case 4:
                MediaDataController.o(this.f15917b, this.f15918c);
                return;
            case 5:
                MediaDataController.m1(this.f15917b, this.f15918c);
                return;
            default:
                MediaDataController.q1(this.f15917b, this.f15918c);
                return;
        }
    }
}
