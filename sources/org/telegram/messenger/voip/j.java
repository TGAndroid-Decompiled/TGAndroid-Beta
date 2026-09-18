package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17851a;
    public final VideoCapturerDevice f17852b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17851a = i10;
        this.f17852b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17851a) {
            case 0:
                this.f17852b.lambda$onDestroy$8();
                return;
            default:
                this.f17852b.lambda$onDestroy$9();
                return;
        }
    }
}
