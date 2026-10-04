package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19571a;
    public final VideoCapturerDevice f19572b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19571a = i10;
        this.f19572b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19571a) {
            case 0:
                this.f19572b.lambda$onDestroy$8();
                return;
            default:
                this.f19572b.lambda$onDestroy$9();
                return;
        }
    }
}
