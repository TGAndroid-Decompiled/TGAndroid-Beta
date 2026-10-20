package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19866a;
    public final VideoCapturerDevice f19867b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19866a = i10;
        this.f19867b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19866a) {
            case 0:
                this.f19867b.lambda$onDestroy$8();
                return;
            default:
                this.f19867b.lambda$onDestroy$9();
                return;
        }
    }
}
