package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19884a;
    public final VideoCapturerDevice f19885b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19884a = i10;
        this.f19885b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19884a) {
            case 0:
                this.f19885b.lambda$onDestroy$8();
                return;
            default:
                this.f19885b.lambda$onDestroy$9();
                return;
        }
    }
}
