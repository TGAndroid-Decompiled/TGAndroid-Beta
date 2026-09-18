package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f15823a;
    public final MediaDataController f15824b;
    public final long f15825c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f15823a = i10;
        this.f15824b = mediaDataController;
        this.f15825c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15823a) {
            case 0:
                MediaDataController.Q0(this.f15824b, this.f15825c);
                return;
            case 1:
                MediaDataController.P2(this.f15824b, this.f15825c);
                return;
            default:
                MediaDataController.E2(this.f15824b, this.f15825c);
                return;
        }
    }
}
