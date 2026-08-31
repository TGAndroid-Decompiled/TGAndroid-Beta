package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f20408a = 0;
    public final VideoCapturerDevice f20409b;
    public final long f20410c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f20409b = videoCapturerDevice;
        this.d = i10;
        this.f20410c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20408a) {
            case 0:
                VideoCapturerDevice.b(this.f20409b, this.d, this.f20410c);
                return;
            default:
                long j10 = this.f20410c;
                VideoCapturerDevice.h(this.f20409b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f20409b = videoCapturerDevice;
        this.f20410c = j10;
        this.d = i10;
    }
}
