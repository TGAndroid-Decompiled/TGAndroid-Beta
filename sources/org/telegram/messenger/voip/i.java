package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27493a;
    public final VideoCapturerDevice f27494b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27493a = i7;
        this.f27494b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27493a) {
            case 0:
                this.f27494b.lambda$onDestroy$8();
                return;
            default:
                this.f27494b.lambda$onDestroy$9();
                return;
        }
    }
}
