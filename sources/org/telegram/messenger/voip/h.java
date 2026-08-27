package org.telegram.messenger.voip;

public final class h implements Runnable {

    public final int f21913a;

    public final VideoCapturerDevice f21914b;

    public h(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f21913a = i10;
        this.f21914b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f21913a) {
            case 0:
                this.f21914b.lambda$onDestroy$8();
                break;
            default:
                this.f21914b.lambda$onDestroy$9();
                break;
        }
    }
}
