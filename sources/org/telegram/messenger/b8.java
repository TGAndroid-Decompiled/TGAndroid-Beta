package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15967a;
    public final MediaDataController f15968b;
    public final String f15969c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15967a = i10;
        this.f15968b = mediaDataController;
        this.f15969c = str;
    }

    @Override
    public final void run() {
        switch (this.f15967a) {
            case 0:
                MediaDataController.F2(this.f15968b, this.f15969c);
                return;
            case 1:
                MediaDataController.u3(this.f15968b, this.f15969c);
                return;
            case 2:
                MediaDataController.k3(this.f15968b, this.f15969c);
                return;
            case 3:
                MediaDataController.S1(this.f15968b, this.f15969c);
                return;
            case 4:
                MediaDataController.o(this.f15968b, this.f15969c);
                return;
            case 5:
                MediaDataController.m1(this.f15968b, this.f15969c);
                return;
            default:
                MediaDataController.q1(this.f15968b, this.f15969c);
                return;
        }
    }
}
