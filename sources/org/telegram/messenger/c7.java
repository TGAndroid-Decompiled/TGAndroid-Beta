package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f15814a;
    public final MediaDataController f15815b;
    public final long f15816c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f15814a = i10;
        this.f15815b = mediaDataController;
        this.f15816c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15814a) {
            case 0:
                MediaDataController.Q0(this.f15815b, this.f15816c);
                return;
            case 1:
                MediaDataController.P2(this.f15815b, this.f15816c);
                return;
            default:
                MediaDataController.E2(this.f15815b, this.f15816c);
                return;
        }
    }
}
