package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f15804a;
    public final MediaDataController f15805b;
    public final long f15806c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f15804a = i10;
        this.f15805b = mediaDataController;
        this.f15806c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15804a) {
            case 0:
                MediaDataController.Q0(this.f15805b, this.f15806c);
                return;
            case 1:
                MediaDataController.P2(this.f15805b, this.f15806c);
                return;
            default:
                MediaDataController.E2(this.f15805b, this.f15806c);
                return;
        }
    }
}
