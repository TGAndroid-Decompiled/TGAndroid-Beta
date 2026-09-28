package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17915a = 0;
    public final VideoCapturerDevice f17916b;
    public final long f17917c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17916b = videoCapturerDevice;
        this.d = i10;
        this.f17917c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                VideoCapturerDevice.b(this.f17916b, this.d, this.f17917c);
                return;
            default:
                long j3 = this.f17917c;
                VideoCapturerDevice.h(this.f17916b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17916b = videoCapturerDevice;
        this.f17917c = j3;
        this.d = i10;
    }
}
