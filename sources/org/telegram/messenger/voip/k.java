package org.telegram.messenger.voip;
public final class k implements Runnable {
    public final int f18822a;
    public final VideoCapturerDevice f18823b;

    public k(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18822a = i10;
        this.f18823b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18822a) {
            case 0:
                this.f18823b.lambda$onDestroy$8();
                return;
            default:
                this.f18823b.lambda$onDestroy$9();
                return;
        }
    }
}
