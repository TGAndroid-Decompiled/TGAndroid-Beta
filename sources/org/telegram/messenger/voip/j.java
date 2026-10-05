package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19568a;
    public final VideoCapturerDevice f19569b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19568a = i10;
        this.f19569b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19568a) {
            case 0:
                this.f19569b.lambda$onDestroy$8();
                return;
            default:
                this.f19569b.lambda$onDestroy$9();
                return;
        }
    }
}
