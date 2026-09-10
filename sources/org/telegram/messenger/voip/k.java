package org.telegram.messenger.voip;
public final class k implements Runnable {
    public final int f16746a = 0;
    public final VideoCapturerDevice f16747b;
    public final long f16748c;
    public final int d;

    public k(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f16747b = videoCapturerDevice;
        this.d = i10;
        this.f16748c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16746a) {
            case 0:
                VideoCapturerDevice.b(this.f16747b, this.d, this.f16748c);
                return;
            default:
                long j3 = this.f16748c;
                VideoCapturerDevice.h(this.f16747b, this.d, j3);
                return;
        }
    }

    public k(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f16747b = videoCapturerDevice;
        this.f16748c = j3;
        this.d = i10;
    }
}
