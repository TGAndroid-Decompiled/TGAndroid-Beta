package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16062a;
    public final MediaDataController f16063b;
    public final long f16064c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16062a = i10;
        this.f16063b = mediaDataController;
        this.f16064c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16062a) {
            case 0:
                MediaDataController.Q0(this.f16063b, this.f16064c);
                return;
            case 1:
                MediaDataController.P2(this.f16063b, this.f16064c);
                return;
            default:
                MediaDataController.E2(this.f16063b, this.f16064c);
                return;
        }
    }
}
