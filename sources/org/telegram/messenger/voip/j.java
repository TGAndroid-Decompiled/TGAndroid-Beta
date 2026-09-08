package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19398a;
    public final VideoCapturerDevice f19399b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19398a = i10;
        this.f19399b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19398a) {
            case 0:
                this.f19399b.lambda$onDestroy$8();
                return;
            default:
                this.f19399b.lambda$onDestroy$9();
                return;
        }
    }
}
