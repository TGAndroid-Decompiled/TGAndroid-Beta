package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16047a;
    public final MediaDataController f16048b;
    public final long f16049c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16047a = i10;
        this.f16048b = mediaDataController;
        this.f16049c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16047a) {
            case 0:
                MediaDataController.Q0(this.f16048b, this.f16049c);
                return;
            case 1:
                MediaDataController.P2(this.f16048b, this.f16049c);
                return;
            default:
                MediaDataController.E2(this.f16048b, this.f16049c);
                return;
        }
    }
}
