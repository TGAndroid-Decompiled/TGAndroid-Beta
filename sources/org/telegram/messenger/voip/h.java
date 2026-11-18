package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27500a = 0;
    public final VideoCapturerDevice f27501b;
    public final long f27502c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27501b = videoCapturerDevice;
        this.d = i7;
        this.f27502c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27500a) {
            case 0:
                VideoCapturerDevice.b(this.f27501b, this.d, this.f27502c);
                return;
            default:
                long j3 = this.f27502c;
                VideoCapturerDevice.h(this.f27501b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27501b = videoCapturerDevice;
        this.f27502c = j3;
        this.d = i7;
    }
}
