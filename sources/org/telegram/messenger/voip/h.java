package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f26124a;
    public final VideoCapturerDevice f26125b;

    public h(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f26124a = i7;
        this.f26125b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f26124a) {
            case 0:
                this.f26125b.lambda$onDestroy$8();
                return;
            default:
                this.f26125b.lambda$onDestroy$9();
                return;
        }
    }
}
