package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27457a;
    public final VideoCapturerDevice f27458b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27457a = i7;
        this.f27458b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27457a) {
            case 0:
                this.f27458b.lambda$onDestroy$8();
                return;
            default:
                this.f27458b.lambda$onDestroy$9();
                return;
        }
    }
}
