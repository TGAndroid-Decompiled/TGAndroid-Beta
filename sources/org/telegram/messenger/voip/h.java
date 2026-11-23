package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27594a = 0;
    public final VideoCapturerDevice f27595b;
    public final long f27596c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27595b = videoCapturerDevice;
        this.d = i7;
        this.f27596c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27594a) {
            case 0:
                VideoCapturerDevice.b(this.f27595b, this.d, this.f27596c);
                return;
            default:
                long j3 = this.f27596c;
                VideoCapturerDevice.h(this.f27595b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27595b = videoCapturerDevice;
        this.f27596c = j3;
        this.d = i7;
    }
}
