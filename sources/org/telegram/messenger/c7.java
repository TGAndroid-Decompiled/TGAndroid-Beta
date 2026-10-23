package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f18086a;
    public final MediaDataController f18087b;
    public final long f18088c;

    public c7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18086a = i10;
        this.f18087b = mediaDataController;
        this.f18088c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18086a) {
            case 0:
                MediaDataController.H0(this.f18087b, this.f18088c);
                return;
            case 1:
                MediaDataController.K2(this.f18087b, this.f18088c);
                return;
            default:
                MediaDataController.z2(this.f18087b, this.f18088c);
                return;
        }
    }
}
