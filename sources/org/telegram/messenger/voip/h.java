package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19862a = 0;
    public final VideoCapturerDevice f19863b;
    public final long f19864c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19863b = videoCapturerDevice;
        this.d = i10;
        this.f19864c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                VideoCapturerDevice.b(this.f19863b, this.d, this.f19864c);
                return;
            default:
                long j10 = this.f19864c;
                VideoCapturerDevice.h(this.f19863b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19863b = videoCapturerDevice;
        this.f19864c = j10;
        this.d = i10;
    }
}
