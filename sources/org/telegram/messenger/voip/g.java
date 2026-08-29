package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f21951a = 0;
    public final VideoCapturerDevice f21952b;
    public final long f21953c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f21952b = videoCapturerDevice;
        this.d = i10;
        this.f21953c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21951a) {
            case 0:
                VideoCapturerDevice.b(this.f21952b, this.d, this.f21953c);
                return;
            default:
                long j10 = this.f21953c;
                VideoCapturerDevice.h(this.f21952b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f21952b = videoCapturerDevice;
        this.f21953c = j10;
        this.d = i10;
    }
}
