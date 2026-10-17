package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19864a;
    public final VideoCapturerDevice f19865b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19864a = i10;
        this.f19865b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19864a) {
            case 0:
                this.f19865b.lambda$onDestroy$8();
                return;
            default:
                this.f19865b.lambda$onDestroy$9();
                return;
        }
    }
}
