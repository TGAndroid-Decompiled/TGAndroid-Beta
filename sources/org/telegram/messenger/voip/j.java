package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19350a;
    public final VideoCapturerDevice f19351b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19350a = i10;
        this.f19351b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19350a) {
            case 0:
                this.f19351b.lambda$onDestroy$8();
                return;
            default:
                this.f19351b.lambda$onDestroy$9();
                return;
        }
    }
}
