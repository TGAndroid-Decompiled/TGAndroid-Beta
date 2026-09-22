package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16050a;
    public final MediaDataController f16051b;
    public final long f16052c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16050a = i10;
        this.f16051b = mediaDataController;
        this.f16052c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16050a) {
            case 0:
                MediaDataController.Q0(this.f16051b, this.f16052c);
                return;
            case 1:
                MediaDataController.P2(this.f16051b, this.f16052c);
                return;
            default:
                MediaDataController.E2(this.f16051b, this.f16052c);
                return;
        }
    }
}
