package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19412a;
    public final VideoCapturerDevice f19413b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19412a = i10;
        this.f19413b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                this.f19413b.lambda$onDestroy$8();
                return;
            default:
                this.f19413b.lambda$onDestroy$9();
                return;
        }
    }
}
