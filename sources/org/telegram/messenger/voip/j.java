package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17889a;
    public final VideoCapturerDevice f17890b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17889a = i10;
        this.f17890b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                this.f17890b.lambda$onDestroy$8();
                return;
            default:
                this.f17890b.lambda$onDestroy$9();
                return;
        }
    }
}
