package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19580a;
    public final VideoCapturerDevice f19581b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19580a = i10;
        this.f19581b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19580a) {
            case 0:
                this.f19581b.lambda$onDestroy$8();
                return;
            default:
                this.f19581b.lambda$onDestroy$9();
                return;
        }
    }
}
