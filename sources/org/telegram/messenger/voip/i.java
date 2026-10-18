package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19875a;
    public final VideoCapturerDevice f19876b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f19875a = i10;
        this.f19876b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f19875a) {
            case 0:
                VideoCapturerDevice.f(this.f19876b);
                return;
            default:
                VideoCapturerDevice.i(this.f19876b);
                return;
        }
    }
}
