package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f18786a = 0;
    public final VideoCapturerDevice f18787b;
    public final long f18788c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18787b = videoCapturerDevice;
        this.d = i10;
        this.f18788c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18786a) {
            case 0:
                VideoCapturerDevice.b(this.f18787b, this.d, this.f18788c);
                return;
            default:
                long j10 = this.f18788c;
                VideoCapturerDevice.h(this.f18787b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18787b = videoCapturerDevice;
        this.f18788c = j10;
        this.d = i10;
    }
}
