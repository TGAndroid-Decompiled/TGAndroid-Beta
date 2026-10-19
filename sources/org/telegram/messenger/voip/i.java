package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19869a;
    public final VideoCapturerDevice f19870b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19869a = i10;
        this.f19870b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19869a) {
            case 0:
                this.f19870b.lambda$onDestroy$8();
                return;
            default:
                this.f19870b.lambda$onDestroy$9();
                return;
        }
    }
}
