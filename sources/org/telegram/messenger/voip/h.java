package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27526a = 0;
    public final VideoCapturerDevice f27527b;
    public final long f27528c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27527b = videoCapturerDevice;
        this.d = i7;
        this.f27528c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27526a) {
            case 0:
                VideoCapturerDevice.b(this.f27527b, this.d, this.f27528c);
                return;
            default:
                long j3 = this.f27528c;
                VideoCapturerDevice.h(this.f27527b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27527b = videoCapturerDevice;
        this.f27528c = j3;
        this.d = i7;
    }
}
