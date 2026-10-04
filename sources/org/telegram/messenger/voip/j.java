package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19570a;
    public final VideoCapturerDevice f19571b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19570a = i10;
        this.f19571b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19570a) {
            case 0:
                this.f19571b.lambda$onDestroy$8();
                return;
            default:
                this.f19571b.lambda$onDestroy$9();
                return;
        }
    }
}
