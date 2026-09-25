package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15969a;
    public final MediaDataController f15970b;
    public final String f15971c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15969a = i10;
        this.f15970b = mediaDataController;
        this.f15971c = str;
    }

    @Override
    public final void run() {
        switch (this.f15969a) {
            case 0:
                MediaDataController.F2(this.f15970b, this.f15971c);
                return;
            case 1:
                MediaDataController.u3(this.f15970b, this.f15971c);
                return;
            case 2:
                MediaDataController.k3(this.f15970b, this.f15971c);
                return;
            case 3:
                MediaDataController.S1(this.f15970b, this.f15971c);
                return;
            case 4:
                MediaDataController.o(this.f15970b, this.f15971c);
                return;
            case 5:
                MediaDataController.m1(this.f15970b, this.f15971c);
                return;
            default:
                MediaDataController.q1(this.f15970b, this.f15971c);
                return;
        }
    }
}
