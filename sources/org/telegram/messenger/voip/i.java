package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19863a;
    public final VideoCapturerDevice f19864b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19863a = i10;
        this.f19864b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19863a) {
            case 0:
                this.f19864b.lambda$onDestroy$8();
                return;
            default:
                this.f19864b.lambda$onDestroy$9();
                return;
        }
    }
}
