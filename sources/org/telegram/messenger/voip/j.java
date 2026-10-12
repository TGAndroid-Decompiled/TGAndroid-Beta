package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19349a;
    public final VideoCapturerDevice f19350b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19349a = i10;
        this.f19350b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19349a) {
            case 0:
                this.f19350b.lambda$onDestroy$8();
                return;
            default:
                this.f19350b.lambda$onDestroy$9();
                return;
        }
    }
}
