package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19947a;
    public final VideoCapturerDevice f19948b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19947a = i10;
        this.f19948b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19947a) {
            case 0:
                this.f19948b.lambda$onDestroy$8();
                return;
            default:
                this.f19948b.lambda$onDestroy$9();
                return;
        }
    }
}
