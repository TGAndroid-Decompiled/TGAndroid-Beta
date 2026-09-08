package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f17339a;
    public final MediaDataController f17340b;
    public final long f17341c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f17339a = i10;
        this.f17340b = mediaDataController;
        this.f17341c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                MediaDataController.Q0(this.f17340b, this.f17341c);
                return;
            case 1:
                MediaDataController.P2(this.f17340b, this.f17341c);
                return;
            default:
                MediaDataController.E2(this.f17340b, this.f17341c);
                return;
        }
    }
}
