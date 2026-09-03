package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f20410a = 0;
    public final VideoCapturerDevice f20411b;
    public final long f20412c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f20411b = videoCapturerDevice;
        this.d = i10;
        this.f20412c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20410a) {
            case 0:
                VideoCapturerDevice.b(this.f20411b, this.d, this.f20412c);
                return;
            default:
                long j10 = this.f20412c;
                VideoCapturerDevice.h(this.f20411b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f20411b = videoCapturerDevice;
        this.f20412c = j10;
        this.d = i10;
    }
}
