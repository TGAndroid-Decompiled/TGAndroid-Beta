package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27136a;
    public final VideoCapturerDevice f27137b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27136a = i7;
        this.f27137b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27136a) {
            case 0:
                this.f27137b.lambda$onDestroy$8();
                return;
            default:
                this.f27137b.lambda$onDestroy$9();
                return;
        }
    }
}
