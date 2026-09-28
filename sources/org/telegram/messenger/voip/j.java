package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17919a;
    public final VideoCapturerDevice f17920b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17919a = i10;
        this.f17920b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17919a) {
            case 0:
                this.f17920b.lambda$onDestroy$8();
                return;
            default:
                this.f17920b.lambda$onDestroy$9();
                return;
        }
    }
}
