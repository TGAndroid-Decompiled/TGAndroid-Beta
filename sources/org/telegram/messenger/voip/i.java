package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17847a = 0;
    public final VideoCapturerDevice f17848b;
    public final long f17849c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17848b = videoCapturerDevice;
        this.d = i10;
        this.f17849c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                VideoCapturerDevice.b(this.f17848b, this.d, this.f17849c);
                return;
            default:
                long j3 = this.f17849c;
                VideoCapturerDevice.h(this.f17848b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17848b = videoCapturerDevice;
        this.f17849c = j3;
        this.d = i10;
    }
}
