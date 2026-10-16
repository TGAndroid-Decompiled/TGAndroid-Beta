package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f18513a;
    public final VideoCapturerDevice f18514b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18513a = i10;
        this.f18514b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18513a) {
            case 0:
                this.f18514b.lambda$onDestroy$8();
                return;
            default:
                this.f18514b.lambda$onDestroy$9();
                return;
        }
    }
}
