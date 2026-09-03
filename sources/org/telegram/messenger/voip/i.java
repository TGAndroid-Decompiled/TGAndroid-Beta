package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f20420a;
    public final VideoCapturerDevice f20421b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f20420a = i10;
        this.f20421b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f20420a) {
            case 0:
                VideoCapturerDevice.f(this.f20421b);
                return;
            default:
                VideoCapturerDevice.i(this.f20421b);
                return;
        }
    }
}
