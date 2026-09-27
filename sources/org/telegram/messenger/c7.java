package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16056a;
    public final MediaDataController f16057b;
    public final long f16058c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16056a = i10;
        this.f16057b = mediaDataController;
        this.f16058c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                MediaDataController.Q0(this.f16057b, this.f16058c);
                return;
            case 1:
                MediaDataController.P2(this.f16057b, this.f16058c);
                return;
            default:
                MediaDataController.E2(this.f16057b, this.f16058c);
                return;
        }
    }
}
