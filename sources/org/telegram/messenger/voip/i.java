package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19408a = 0;
    public final VideoCapturerDevice f19409b;
    public final long f19410c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19409b = videoCapturerDevice;
        this.d = i10;
        this.f19410c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19408a) {
            case 0:
                VideoCapturerDevice.b(this.f19409b, this.d, this.f19410c);
                return;
            default:
                long j3 = this.f19410c;
                VideoCapturerDevice.h(this.f19409b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19409b = videoCapturerDevice;
        this.f19410c = j3;
        this.d = i10;
    }
}
