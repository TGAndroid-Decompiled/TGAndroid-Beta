package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f18145a;
    public final MediaDataController f18146b;
    public final long f18147c;

    public d7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18145a = i10;
        this.f18146b = mediaDataController;
        this.f18147c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                MediaDataController.H0(this.f18146b, this.f18147c);
                return;
            case 1:
                MediaDataController.K2(this.f18146b, this.f18147c);
                return;
            default:
                MediaDataController.z2(this.f18146b, this.f18147c);
                return;
        }
    }
}
