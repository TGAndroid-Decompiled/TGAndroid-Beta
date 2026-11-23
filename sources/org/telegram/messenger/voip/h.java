package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27453a = 0;
    public final VideoCapturerDevice f27454b;
    public final long f27455c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27454b = videoCapturerDevice;
        this.d = i7;
        this.f27455c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27453a) {
            case 0:
                VideoCapturerDevice.b(this.f27454b, this.d, this.f27455c);
                return;
            default:
                long j3 = this.f27455c;
                VideoCapturerDevice.h(this.f27454b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27454b = videoCapturerDevice;
        this.f27455c = j3;
        this.d = i7;
    }
}
