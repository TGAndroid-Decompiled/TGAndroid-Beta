package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19872a;
    public final VideoCapturerDevice f19873b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19872a = i10;
        this.f19873b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19872a) {
            case 0:
                this.f19873b.lambda$onDestroy$8();
                return;
            default:
                this.f19873b.lambda$onDestroy$9();
                return;
        }
    }
}
