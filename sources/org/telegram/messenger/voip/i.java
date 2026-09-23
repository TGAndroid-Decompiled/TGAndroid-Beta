package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17645a = 0;
    public final VideoCapturerDevice f17646b;
    public final long f17647c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17646b = videoCapturerDevice;
        this.d = i10;
        this.f17647c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17645a) {
            case 0:
                VideoCapturerDevice.b(this.f17646b, this.d, this.f17647c);
                return;
            default:
                long j3 = this.f17647c;
                VideoCapturerDevice.h(this.f17646b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17646b = videoCapturerDevice;
        this.f17647c = j3;
        this.d = i10;
    }
}
