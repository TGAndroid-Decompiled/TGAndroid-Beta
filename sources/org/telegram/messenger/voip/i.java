package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19569a = 0;
    public final VideoCapturerDevice f19570b;
    public final long f19571c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19570b = videoCapturerDevice;
        this.d = i10;
        this.f19571c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19569a) {
            case 0:
                VideoCapturerDevice.b(this.f19570b, this.d, this.f19571c);
                return;
            default:
                long j3 = this.f19571c;
                VideoCapturerDevice.h(this.f19570b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19570b = videoCapturerDevice;
        this.f19571c = j3;
        this.d = i10;
    }
}
