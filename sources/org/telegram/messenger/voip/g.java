package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f21628a = 0;
    public final VideoCapturerDevice f21629b;
    public final long f21630c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f21629b = videoCapturerDevice;
        this.d = i10;
        this.f21630c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21628a) {
            case 0:
                VideoCapturerDevice.b(this.f21629b, this.d, this.f21630c);
                return;
            default:
                long j10 = this.f21630c;
                VideoCapturerDevice.h(this.f21629b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f21629b = videoCapturerDevice;
        this.f21630c = j10;
        this.d = i10;
    }
}
