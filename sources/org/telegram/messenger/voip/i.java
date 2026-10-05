package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19564a = 0;
    public final VideoCapturerDevice f19565b;
    public final long f19566c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19565b = videoCapturerDevice;
        this.d = i10;
        this.f19566c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19564a) {
            case 0:
                VideoCapturerDevice.b(this.f19565b, this.d, this.f19566c);
                return;
            default:
                long j3 = this.f19566c;
                VideoCapturerDevice.h(this.f19565b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19565b = videoCapturerDevice;
        this.f19566c = j3;
        this.d = i10;
    }
}
