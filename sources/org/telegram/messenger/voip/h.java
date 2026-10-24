package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19943a = 0;
    public final VideoCapturerDevice f19944b;
    public final long f19945c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19944b = videoCapturerDevice;
        this.d = i10;
        this.f19945c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19943a) {
            case 0:
                VideoCapturerDevice.b(this.f19944b, this.d, this.f19945c);
                return;
            default:
                long j10 = this.f19945c;
                VideoCapturerDevice.h(this.f19944b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19944b = videoCapturerDevice;
        this.f19945c = j10;
        this.d = i10;
    }
}
