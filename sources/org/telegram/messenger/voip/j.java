package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19371a;
    public final VideoCapturerDevice f19372b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19371a = i10;
        this.f19372b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19371a) {
            case 0:
                this.f19372b.lambda$onDestroy$8();
                return;
            default:
                this.f19372b.lambda$onDestroy$9();
                return;
        }
    }
}
