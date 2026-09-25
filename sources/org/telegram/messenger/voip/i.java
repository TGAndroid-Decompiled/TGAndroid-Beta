package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17904a = 0;
    public final VideoCapturerDevice f17905b;
    public final long f17906c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17905b = videoCapturerDevice;
        this.d = i10;
        this.f17906c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                VideoCapturerDevice.b(this.f17905b, this.d, this.f17906c);
                return;
            default:
                long j3 = this.f17906c;
                VideoCapturerDevice.h(this.f17905b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17905b = videoCapturerDevice;
        this.f17906c = j3;
        this.d = i10;
    }
}
