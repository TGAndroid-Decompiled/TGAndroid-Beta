package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17935a;
    public final VideoCapturerDevice f17936b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17935a = i10;
        this.f17936b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17935a) {
            case 0:
                this.f17936b.lambda$onDestroy$8();
                return;
            default:
                this.f17936b.lambda$onDestroy$9();
                return;
        }
    }
}
