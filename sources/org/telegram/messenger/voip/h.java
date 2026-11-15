package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f27132a = 0;
    public final VideoCapturerDevice f27133b;
    public final long f27134c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f27133b = videoCapturerDevice;
        this.d = i7;
        this.f27134c = j3;
    }

    @Override
    public final void run() {
        switch (this.f27132a) {
            case 0:
                VideoCapturerDevice.b(this.f27133b, this.d, this.f27134c);
                return;
            default:
                long j3 = this.f27134c;
                VideoCapturerDevice.h(this.f27133b, this.d, j3);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f27133b = videoCapturerDevice;
        this.f27134c = j3;
        this.d = i7;
    }
}
