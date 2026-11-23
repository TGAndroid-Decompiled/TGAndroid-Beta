package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27489a = 0;
    public final VideoCapturerDevice f27490b;
    public final long f27491c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27490b = videoCapturerDevice;
        this.d = i7;
        this.f27491c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27489a) {
            case 0:
                VideoCapturerDevice.b(this.f27490b, this.d, this.f27491c);
                return;
            default:
                long j3 = this.f27491c;
                VideoCapturerDevice.h(this.f27490b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27490b = videoCapturerDevice;
        this.f27491c = j3;
        this.d = i7;
    }
}
