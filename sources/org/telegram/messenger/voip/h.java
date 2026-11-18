package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27498a = 0;
    public final VideoCapturerDevice f27499b;
    public final long f27500c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27499b = videoCapturerDevice;
        this.d = i7;
        this.f27500c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27498a) {
            case 0:
                VideoCapturerDevice.b(this.f27499b, this.d, this.f27500c);
                return;
            default:
                long j3 = this.f27500c;
                VideoCapturerDevice.h(this.f27499b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27499b = videoCapturerDevice;
        this.f27500c = j3;
        this.d = i7;
    }
}
