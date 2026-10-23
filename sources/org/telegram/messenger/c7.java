package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f18023a;
    public final MediaDataController f18024b;
    public final long f18025c;

    public c7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18023a = i10;
        this.f18024b = mediaDataController;
        this.f18025c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18023a) {
            case 0:
                MediaDataController.H0(this.f18024b, this.f18025c);
                return;
            case 1:
                MediaDataController.K2(this.f18024b, this.f18025c);
                return;
            default:
                MediaDataController.z2(this.f18024b, this.f18025c);
                return;
        }
    }
}
