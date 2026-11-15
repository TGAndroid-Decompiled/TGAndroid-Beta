package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27131a = 0;
    public final VideoCapturerDevice f27132b;
    public final long f27133c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27132b = videoCapturerDevice;
        this.d = i7;
        this.f27133c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27131a) {
            case 0:
                VideoCapturerDevice.b(this.f27132b, this.d, this.f27133c);
                return;
            default:
                long j3 = this.f27133c;
                VideoCapturerDevice.h(this.f27132b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27132b = videoCapturerDevice;
        this.f27133c = j3;
        this.d = i7;
    }
}
