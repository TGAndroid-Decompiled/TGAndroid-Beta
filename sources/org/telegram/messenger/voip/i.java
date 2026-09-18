package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17670a = 0;
    public final VideoCapturerDevice f17671b;
    public final long f17672c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17671b = videoCapturerDevice;
        this.d = i10;
        this.f17672c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17670a) {
            case 0:
                VideoCapturerDevice.b(this.f17671b, this.d, this.f17672c);
                return;
            default:
                long j3 = this.f17672c;
                VideoCapturerDevice.h(this.f17671b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17671b = videoCapturerDevice;
        this.f17672c = j3;
        this.d = i10;
    }
}
