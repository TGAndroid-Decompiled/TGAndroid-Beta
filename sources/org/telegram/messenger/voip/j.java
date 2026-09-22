package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17660a;
    public final VideoCapturerDevice f17661b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17660a = i10;
        this.f17661b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17660a) {
            case 0:
                this.f17661b.lambda$onDestroy$8();
                return;
            default:
                this.f17661b.lambda$onDestroy$9();
                return;
        }
    }
}
