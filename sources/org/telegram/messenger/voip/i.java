package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19381a = 0;
    public final VideoCapturerDevice f19382b;
    public final long f19383c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19382b = videoCapturerDevice;
        this.d = i10;
        this.f19383c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19381a) {
            case 0:
                VideoCapturerDevice.b(this.f19382b, this.d, this.f19383c);
                return;
            default:
                long j3 = this.f19383c;
                VideoCapturerDevice.h(this.f19382b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19382b = videoCapturerDevice;
        this.f19383c = j3;
        this.d = i10;
    }
}
