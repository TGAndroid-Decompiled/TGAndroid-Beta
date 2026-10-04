package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19566a = 0;
    public final VideoCapturerDevice f19567b;
    public final long f19568c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19567b = videoCapturerDevice;
        this.d = i10;
        this.f19568c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19566a) {
            case 0:
                VideoCapturerDevice.b(this.f19567b, this.d, this.f19568c);
                return;
            default:
                long j3 = this.f19568c;
                VideoCapturerDevice.h(this.f19567b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19567b = videoCapturerDevice;
        this.f19568c = j3;
        this.d = i10;
    }
}
