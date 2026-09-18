package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17674a;
    public final VideoCapturerDevice f17675b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17674a = i10;
        this.f17675b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17674a) {
            case 0:
                this.f17675b.lambda$onDestroy$8();
                return;
            default:
                this.f17675b.lambda$onDestroy$9();
                return;
        }
    }
}
