package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17918a;
    public final VideoCapturerDevice f17919b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17918a = i10;
        this.f17919b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17918a) {
            case 0:
                this.f17919b.lambda$onDestroy$8();
                return;
            default:
                this.f17919b.lambda$onDestroy$9();
                return;
        }
    }
}
