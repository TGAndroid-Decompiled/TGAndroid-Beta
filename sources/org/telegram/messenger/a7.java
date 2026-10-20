package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f17844a;
    public final MediaDataController f17845b;
    public final long f17846c;

    public a7(MediaDataController mediaDataController, long j10, int i10) {
        this.f17844a = i10;
        this.f17845b = mediaDataController;
        this.f17846c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17844a) {
            case 0:
                MediaDataController.H0(this.f17845b, this.f17846c);
                return;
            case 1:
                MediaDataController.K2(this.f17845b, this.f17846c);
                return;
            default:
                MediaDataController.z2(this.f17845b, this.f17846c);
                return;
        }
    }
}
