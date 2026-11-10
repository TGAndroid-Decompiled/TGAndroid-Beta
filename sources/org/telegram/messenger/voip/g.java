package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f26124a = 0;
    public final VideoCapturerDevice f26125b;
    public final long f26126c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f26125b = videoCapturerDevice;
        this.d = i7;
        this.f26126c = j3;
    }

    @Override
    public final void run() {
        switch (this.f26124a) {
            case 0:
                VideoCapturerDevice.b(this.f26125b, this.d, this.f26126c);
                return;
            default:
                long j3 = this.f26126c;
                VideoCapturerDevice.h(this.f26125b, this.d, j3);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f26125b = videoCapturerDevice;
        this.f26126c = j3;
        this.d = i7;
    }
}
