package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17904a;
    public final VideoCapturerDevice f17905b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17904a = i10;
        this.f17905b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                this.f17905b.lambda$onDestroy$8();
                return;
            default:
                this.f17905b.lambda$onDestroy$9();
                return;
        }
    }
}
