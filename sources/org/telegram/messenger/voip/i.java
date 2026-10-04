package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19567a = 0;
    public final VideoCapturerDevice f19568b;
    public final long f19569c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19568b = videoCapturerDevice;
        this.d = i10;
        this.f19569c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19567a) {
            case 0:
                VideoCapturerDevice.b(this.f19568b, this.d, this.f19569c);
                return;
            default:
                long j3 = this.f19569c;
                VideoCapturerDevice.h(this.f19568b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19568b = videoCapturerDevice;
        this.f19569c = j3;
        this.d = i10;
    }
}
