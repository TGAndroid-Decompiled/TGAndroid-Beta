package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19563a;
    public final VideoCapturerDevice f19564b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19563a = i10;
        this.f19564b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                this.f19564b.lambda$onDestroy$8();
                return;
            default:
                this.f19564b.lambda$onDestroy$9();
                return;
        }
    }
}
