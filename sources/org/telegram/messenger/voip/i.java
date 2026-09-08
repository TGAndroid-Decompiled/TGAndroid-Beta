package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19394a = 0;
    public final VideoCapturerDevice f19395b;
    public final long f19396c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19395b = videoCapturerDevice;
        this.d = i10;
        this.f19396c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19394a) {
            case 0:
                VideoCapturerDevice.b(this.f19395b, this.d, this.f19396c);
                return;
            default:
                long j3 = this.f19396c;
                VideoCapturerDevice.h(this.f19395b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19395b = videoCapturerDevice;
        this.f19396c = j3;
        this.d = i10;
    }
}
