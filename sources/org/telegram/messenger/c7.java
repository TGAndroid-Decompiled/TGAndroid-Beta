package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16035a;
    public final MediaDataController f16036b;
    public final long f16037c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16035a = i10;
        this.f16036b = mediaDataController;
        this.f16037c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16035a) {
            case 0:
                MediaDataController.Q0(this.f16036b, this.f16037c);
                return;
            case 1:
                MediaDataController.P2(this.f16036b, this.f16037c);
                return;
            default:
                MediaDataController.E2(this.f16036b, this.f16037c);
                return;
        }
    }
}
