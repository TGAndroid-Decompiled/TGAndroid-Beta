package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17889a = 0;
    public final VideoCapturerDevice f17890b;
    public final long f17891c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17890b = videoCapturerDevice;
        this.d = i10;
        this.f17891c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                VideoCapturerDevice.b(this.f17890b, this.d, this.f17891c);
                return;
            default:
                long j3 = this.f17891c;
                VideoCapturerDevice.h(this.f17890b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17890b = videoCapturerDevice;
        this.f17891c = j3;
        this.d = i10;
    }
}
