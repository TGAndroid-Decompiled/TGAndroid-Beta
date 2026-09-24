package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17893a;
    public final VideoCapturerDevice f17894b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17893a = i10;
        this.f17894b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                VideoCapturerDevice.f(this.f17894b);
                return;
            default:
                VideoCapturerDevice.i(this.f17894b);
                return;
        }
    }
}
