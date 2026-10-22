package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19880a = 0;
    public final VideoCapturerDevice f19881b;
    public final long f19882c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19881b = videoCapturerDevice;
        this.d = i10;
        this.f19882c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19880a) {
            case 0:
                VideoCapturerDevice.b(this.f19881b, this.d, this.f19882c);
                return;
            default:
                long j10 = this.f19882c;
                VideoCapturerDevice.h(this.f19881b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19881b = videoCapturerDevice;
        this.f19882c = j10;
        this.d = i10;
    }
}
