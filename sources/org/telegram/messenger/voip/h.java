package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19859a = 0;
    public final VideoCapturerDevice f19860b;
    public final long f19861c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19860b = videoCapturerDevice;
        this.d = i10;
        this.f19861c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19859a) {
            case 0:
                VideoCapturerDevice.b(this.f19860b, this.d, this.f19861c);
                return;
            default:
                long j10 = this.f19861c;
                VideoCapturerDevice.h(this.f19860b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19860b = videoCapturerDevice;
        this.f19861c = j10;
        this.d = i10;
    }
}
