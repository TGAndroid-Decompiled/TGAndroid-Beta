package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27135a;
    public final VideoCapturerDevice f27136b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27135a = i7;
        this.f27136b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27135a) {
            case 0:
                this.f27136b.lambda$onDestroy$8();
                return;
            default:
                this.f27136b.lambda$onDestroy$9();
                return;
        }
    }
}
