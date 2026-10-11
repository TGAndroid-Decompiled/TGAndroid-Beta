package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19605a = 0;
    public final VideoCapturerDevice f19606b;
    public final long f19607c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19606b = videoCapturerDevice;
        this.d = i10;
        this.f19607c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19605a) {
            case 0:
                VideoCapturerDevice.b(this.f19606b, this.d, this.f19607c);
                return;
            default:
                long j3 = this.f19607c;
                VideoCapturerDevice.h(this.f19606b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19606b = videoCapturerDevice;
        this.f19607c = j3;
        this.d = i10;
    }
}
