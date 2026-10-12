package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19346a = 0;
    public final VideoCapturerDevice f19347b;
    public final long f19348c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19347b = videoCapturerDevice;
        this.d = i10;
        this.f19348c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                VideoCapturerDevice.b(this.f19347b, this.d, this.f19348c);
                return;
            default:
                long j3 = this.f19348c;
                VideoCapturerDevice.h(this.f19347b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19347b = videoCapturerDevice;
        this.f19348c = j3;
        this.d = i10;
    }
}
