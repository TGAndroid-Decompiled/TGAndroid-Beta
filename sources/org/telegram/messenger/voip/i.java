package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19952a;
    public final VideoCapturerDevice f19953b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19952a = i10;
        this.f19953b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19952a) {
            case 0:
                this.f19953b.lambda$onDestroy$8();
                return;
            default:
                this.f19953b.lambda$onDestroy$9();
                return;
        }
    }
}
