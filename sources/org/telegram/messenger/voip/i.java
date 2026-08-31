package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f20418a;
    public final VideoCapturerDevice f20419b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f20418a = i10;
        this.f20419b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f20418a) {
            case 0:
                this.f20419b.lambda$onDestroy$8();
                return;
            default:
                this.f20419b.lambda$onDestroy$9();
                return;
        }
    }
}
