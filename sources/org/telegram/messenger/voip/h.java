package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f21644a;
    public final VideoCapturerDevice f21645b;

    public h(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f21644a = i10;
        this.f21645b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f21644a) {
            case 0:
                this.f21645b.lambda$onDestroy$8();
                return;
            default:
                this.f21645b.lambda$onDestroy$9();
                return;
        }
    }
}
