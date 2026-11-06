package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f26118a;
    public final VideoCapturerDevice f26119b;

    public h(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f26118a = i7;
        this.f26119b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f26118a) {
            case 0:
                this.f26119b.lambda$onDestroy$8();
                return;
            default:
                this.f26119b.lambda$onDestroy$9();
                return;
        }
    }
}
