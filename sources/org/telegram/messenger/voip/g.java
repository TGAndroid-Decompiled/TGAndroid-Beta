package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f21640a = 0;
    public final VideoCapturerDevice f21641b;
    public final long f21642c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f21641b = videoCapturerDevice;
        this.d = i10;
        this.f21642c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21640a) {
            case 0:
                VideoCapturerDevice.b(this.f21641b, this.d, this.f21642c);
                return;
            default:
                long j10 = this.f21642c;
                VideoCapturerDevice.h(this.f21641b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f21641b = videoCapturerDevice;
        this.f21642c = j10;
        this.d = i10;
    }
}
