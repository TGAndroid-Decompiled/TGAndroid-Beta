package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17908a;
    public final VideoCapturerDevice f17909b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17908a = i10;
        this.f17909b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17908a) {
            case 0:
                this.f17909b.lambda$onDestroy$8();
                return;
            default:
                this.f17909b.lambda$onDestroy$9();
                return;
        }
    }
}
