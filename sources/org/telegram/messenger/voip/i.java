package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19345a = 0;
    public final VideoCapturerDevice f19346b;
    public final long f19347c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19346b = videoCapturerDevice;
        this.d = i10;
        this.f19347c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19345a) {
            case 0:
                VideoCapturerDevice.b(this.f19346b, this.d, this.f19347c);
                return;
            default:
                long j3 = this.f19347c;
                VideoCapturerDevice.h(this.f19346b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19346b = videoCapturerDevice;
        this.f19347c = j3;
        this.d = i10;
    }
}
