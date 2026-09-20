package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17885a = 0;
    public final VideoCapturerDevice f17886b;
    public final long f17887c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17886b = videoCapturerDevice;
        this.d = i10;
        this.f17887c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17885a) {
            case 0:
                VideoCapturerDevice.b(this.f17886b, this.d, this.f17887c);
                return;
            default:
                long j3 = this.f17887c;
                VideoCapturerDevice.h(this.f17886b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17886b = videoCapturerDevice;
        this.f17887c = j3;
        this.d = i10;
    }
}
