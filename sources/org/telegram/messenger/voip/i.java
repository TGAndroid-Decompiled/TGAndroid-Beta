package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27502a;
    public final VideoCapturerDevice f27503b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27502a = i7;
        this.f27503b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27502a) {
            case 0:
                this.f27503b.lambda$onDestroy$8();
                return;
            default:
                this.f27503b.lambda$onDestroy$9();
                return;
        }
    }
}
