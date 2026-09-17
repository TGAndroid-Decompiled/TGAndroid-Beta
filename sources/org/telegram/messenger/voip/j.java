package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19385a;
    public final VideoCapturerDevice f19386b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19385a = i10;
        this.f19386b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19385a) {
            case 0:
                this.f19386b.lambda$onDestroy$8();
                return;
            default:
                this.f19386b.lambda$onDestroy$9();
                return;
        }
    }
}
