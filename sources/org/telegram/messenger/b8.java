package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15952a;
    public final MediaDataController f15953b;
    public final String f15954c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15952a = i10;
        this.f15953b = mediaDataController;
        this.f15954c = str;
    }

    @Override
    public final void run() {
        switch (this.f15952a) {
            case 0:
                MediaDataController.F2(this.f15953b, this.f15954c);
                return;
            case 1:
                MediaDataController.u3(this.f15953b, this.f15954c);
                return;
            case 2:
                MediaDataController.k3(this.f15953b, this.f15954c);
                return;
            case 3:
                MediaDataController.S1(this.f15953b, this.f15954c);
                return;
            case 4:
                MediaDataController.o(this.f15953b, this.f15954c);
                return;
            case 5:
                MediaDataController.m1(this.f15953b, this.f15954c);
                return;
            default:
                MediaDataController.q1(this.f15953b, this.f15954c);
                return;
        }
    }
}
