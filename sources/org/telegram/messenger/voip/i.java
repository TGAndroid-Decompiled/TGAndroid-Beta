package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17898a = 0;
    public final VideoCapturerDevice f17899b;
    public final long f17900c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17899b = videoCapturerDevice;
        this.d = i10;
        this.f17900c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17898a) {
            case 0:
                VideoCapturerDevice.b(this.f17899b, this.d, this.f17900c);
                return;
            default:
                long j3 = this.f17900c;
                VideoCapturerDevice.h(this.f17899b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17899b = videoCapturerDevice;
        this.f17900c = j3;
        this.d = i10;
    }
}
