package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19570a = 0;
    public final VideoCapturerDevice f19571b;
    public final long f19572c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19571b = videoCapturerDevice;
        this.d = i10;
        this.f19572c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19570a) {
            case 0:
                VideoCapturerDevice.b(this.f19571b, this.d, this.f19572c);
                return;
            default:
                long j3 = this.f19572c;
                VideoCapturerDevice.h(this.f19571b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19571b = videoCapturerDevice;
        this.f19572c = j3;
        this.d = i10;
    }
}
