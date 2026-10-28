package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f21632a;
    public final VideoCapturerDevice f21633b;

    public h(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f21632a = i10;
        this.f21633b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f21632a) {
            case 0:
                this.f21633b.lambda$onDestroy$8();
                return;
            default:
                this.f21633b.lambda$onDestroy$9();
                return;
        }
    }
}
