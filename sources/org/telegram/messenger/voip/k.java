package org.telegram.messenger.voip;
public final class k implements Runnable {
    public final int f18669a;
    public final VideoCapturerDevice f18670b;

    public k(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18669a = i10;
        this.f18670b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18669a) {
            case 0:
                this.f18670b.lambda$onDestroy$8();
                return;
            default:
                this.f18670b.lambda$onDestroy$9();
                return;
        }
    }
}
