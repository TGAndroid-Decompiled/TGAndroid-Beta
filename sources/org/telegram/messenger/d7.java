package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f18208a;
    public final MediaDataController f18209b;
    public final long f18210c;

    public d7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18208a = i10;
        this.f18209b = mediaDataController;
        this.f18210c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18208a) {
            case 0:
                MediaDataController.H0(this.f18209b, this.f18210c);
                return;
            case 1:
                MediaDataController.K2(this.f18209b, this.f18210c);
                return;
            default:
                MediaDataController.z2(this.f18209b, this.f18210c);
                return;
        }
    }
}
