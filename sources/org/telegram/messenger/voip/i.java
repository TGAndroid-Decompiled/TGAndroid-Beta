package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18790a;
    public final VideoCapturerDevice f18791b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18790a = i10;
        this.f18791b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$onDestroy$8();
                return;
            default:
                this.f18791b.lambda$onDestroy$9();
                return;
        }
    }
}
