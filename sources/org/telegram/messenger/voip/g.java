package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f18762a = 0;
    public final VideoCapturerDevice f18763b;
    public final long f18764c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18763b = videoCapturerDevice;
        this.d = i10;
        this.f18764c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18762a) {
            case 0:
                VideoCapturerDevice.b(this.f18763b, this.d, this.f18764c);
                return;
            default:
                long j10 = this.f18764c;
                VideoCapturerDevice.h(this.f18763b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18763b = videoCapturerDevice;
        this.f18764c = j10;
        this.d = i10;
    }
}
