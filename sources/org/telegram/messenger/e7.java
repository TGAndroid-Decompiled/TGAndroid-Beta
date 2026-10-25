package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f19970a;
    public final MediaDataController f19971b;
    public final long f19972c;

    public e7(MediaDataController mediaDataController, long j10, int i10) {
        this.f19970a = i10;
        this.f19971b = mediaDataController;
        this.f19972c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19970a) {
            case 0:
                MediaDataController.H0(this.f19971b, this.f19972c);
                return;
            case 1:
                MediaDataController.K2(this.f19971b, this.f19972c);
                return;
            default:
                MediaDataController.z2(this.f19971b, this.f19972c);
                return;
        }
    }
}
