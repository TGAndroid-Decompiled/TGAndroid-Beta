package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19948a = 0;
    public final VideoCapturerDevice f19949b;
    public final long f19950c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19949b = videoCapturerDevice;
        this.d = i10;
        this.f19950c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                VideoCapturerDevice.b(this.f19949b, this.d, this.f19950c);
                return;
            default:
                long j10 = this.f19950c;
                VideoCapturerDevice.h(this.f19949b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19949b = videoCapturerDevice;
        this.f19950c = j10;
        this.d = i10;
    }
}
