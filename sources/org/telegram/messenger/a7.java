package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f19701a;
    public final MediaDataController f19702b;
    public final long f19703c;

    public a7(MediaDataController mediaDataController, long j10, int i9) {
        this.f19701a = i9;
        this.f19702b = mediaDataController;
        this.f19703c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19701a) {
            case 0:
                MediaDataController.Q0(this.f19702b, this.f19703c);
                return;
            case 1:
                MediaDataController.P2(this.f19702b, this.f19703c);
                return;
            default:
                MediaDataController.E2(this.f19702b, this.f19703c);
                return;
        }
    }
}
