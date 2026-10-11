package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f19573a;
    public final VideoCapturerDevice f19574b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19573a = i10;
        this.f19574b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19573a) {
            case 0:
                this.f19574b.lambda$onDestroy$8();
                return;
            default:
                this.f19574b.lambda$onDestroy$9();
                return;
        }
    }
}
