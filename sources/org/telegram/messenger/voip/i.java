package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19367a = 0;
    public final VideoCapturerDevice f19368b;
    public final long f19369c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19368b = videoCapturerDevice;
        this.d = i10;
        this.f19369c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19367a) {
            case 0:
                VideoCapturerDevice.b(this.f19368b, this.d, this.f19369c);
                return;
            default:
                long j3 = this.f19369c;
                VideoCapturerDevice.h(this.f19368b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19368b = videoCapturerDevice;
        this.f19369c = j3;
        this.d = i10;
    }
}
