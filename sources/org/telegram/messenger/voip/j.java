package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17902a;
    public final VideoCapturerDevice f17903b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17902a = i10;
        this.f17903b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17902a) {
            case 0:
                this.f17903b.lambda$onDestroy$8();
                return;
            default:
                this.f17903b.lambda$onDestroy$9();
                return;
        }
    }
}
