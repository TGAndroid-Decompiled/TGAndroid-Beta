package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19576a;
    public final VideoCapturerDevice f19577b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19576a = i10;
        this.f19577b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19576a) {
            case 0:
                this.f19577b.lambda$onDestroy$8();
                return;
            default:
                this.f19577b.lambda$onDestroy$9();
                return;
        }
    }
}
