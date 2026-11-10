package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f26128a;
    public final VideoCapturerDevice f26129b;

    public h(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f26128a = i7;
        this.f26129b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f26128a) {
            case 0:
                this.f26129b.lambda$onDestroy$8();
                return;
            default:
                this.f26129b.lambda$onDestroy$9();
                return;
        }
    }
}
