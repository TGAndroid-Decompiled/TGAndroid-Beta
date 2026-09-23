package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f15714a;
    public final MediaDataController f15715b;
    public final String f15716c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f15714a = i10;
        this.f15715b = mediaDataController;
        this.f15716c = str;
    }

    @Override
    public final void run() {
        switch (this.f15714a) {
            case 0:
                MediaDataController.F2(this.f15715b, this.f15716c);
                return;
            case 1:
                MediaDataController.u3(this.f15715b, this.f15716c);
                return;
            case 2:
                MediaDataController.k3(this.f15715b, this.f15716c);
                return;
            case 3:
                MediaDataController.S1(this.f15715b, this.f15716c);
                return;
            case 4:
                MediaDataController.o(this.f15715b, this.f15716c);
                return;
            case 5:
                MediaDataController.m1(this.f15715b, this.f15716c);
                return;
            default:
                MediaDataController.q1(this.f15715b, this.f15716c);
                return;
        }
    }
}
