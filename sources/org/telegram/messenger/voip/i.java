package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27530a;
    public final VideoCapturerDevice f27531b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27530a = i7;
        this.f27531b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27530a) {
            case 0:
                this.f27531b.lambda$onDestroy$8();
                return;
            default:
                this.f27531b.lambda$onDestroy$9();
                return;
        }
    }
}
