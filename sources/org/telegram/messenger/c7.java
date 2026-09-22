package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f15810a;
    public final MediaDataController f15811b;
    public final long f15812c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f15810a = i10;
        this.f15811b = mediaDataController;
        this.f15812c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15810a) {
            case 0:
                MediaDataController.Q0(this.f15811b, this.f15812c);
                return;
            case 1:
                MediaDataController.P2(this.f15811b, this.f15812c);
                return;
            default:
                MediaDataController.E2(this.f15811b, this.f15812c);
                return;
        }
    }
}
