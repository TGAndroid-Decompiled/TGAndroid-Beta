package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17656a = 0;
    public final VideoCapturerDevice f17657b;
    public final long f17658c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17657b = videoCapturerDevice;
        this.d = i10;
        this.f17658c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17656a) {
            case 0:
                VideoCapturerDevice.b(this.f17657b, this.d, this.f17658c);
                return;
            default:
                long j3 = this.f17658c;
                VideoCapturerDevice.h(this.f17657b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17657b = videoCapturerDevice;
        this.f17658c = j3;
        this.d = i10;
    }
}
