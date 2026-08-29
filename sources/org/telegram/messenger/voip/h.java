package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f21955a;
    public final VideoCapturerDevice f21956b;

    public h(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f21955a = i10;
        this.f21956b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f21955a) {
            case 0:
                this.f21956b.lambda$onDestroy$8();
                return;
            default:
                this.f21956b.lambda$onDestroy$9();
                return;
        }
    }
}
