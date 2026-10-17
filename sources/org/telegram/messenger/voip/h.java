package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19860a = 0;
    public final VideoCapturerDevice f19861b;
    public final long f19862c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19861b = videoCapturerDevice;
        this.d = i10;
        this.f19862c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19860a) {
            case 0:
                VideoCapturerDevice.b(this.f19861b, this.d, this.f19862c);
                return;
            default:
                long j10 = this.f19862c;
                VideoCapturerDevice.h(this.f19861b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19861b = videoCapturerDevice;
        this.f19862c = j10;
        this.d = i10;
    }
}
