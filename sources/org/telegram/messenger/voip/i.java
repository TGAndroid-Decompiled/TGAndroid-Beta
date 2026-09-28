package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17914a = 0;
    public final VideoCapturerDevice f17915b;
    public final long f17916c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17915b = videoCapturerDevice;
        this.d = i10;
        this.f17916c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                VideoCapturerDevice.b(this.f17915b, this.d, this.f17916c);
                return;
            default:
                long j3 = this.f17916c;
                VideoCapturerDevice.h(this.f17915b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17915b = videoCapturerDevice;
        this.f17916c = j3;
        this.d = i10;
    }
}
