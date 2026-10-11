package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19609a;
    public final VideoCapturerDevice f19610b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19609a = i10;
        this.f19610b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19609a) {
            case 0:
                this.f19610b.lambda$onDestroy$8();
                return;
            default:
                this.f19610b.lambda$onDestroy$9();
                return;
        }
    }
}
