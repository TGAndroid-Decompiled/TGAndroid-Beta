package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19887a;
    public final VideoCapturerDevice f19888b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19887a = i10;
        this.f19888b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19887a) {
            case 0:
                this.f19888b.lambda$onDestroy$8();
                return;
            default:
                this.f19888b.lambda$onDestroy$9();
                return;
        }
    }
}
