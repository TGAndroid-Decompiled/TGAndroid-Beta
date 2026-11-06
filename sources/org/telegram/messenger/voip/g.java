package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f26106a = 0;
    public final VideoCapturerDevice f26107b;
    public final long f26108c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f26107b = videoCapturerDevice;
        this.d = i7;
        this.f26108c = j3;
    }

    @Override
    public final void run() {
        switch (this.f26106a) {
            case 0:
                VideoCapturerDevice.b(this.f26107b, this.d, this.f26108c);
                return;
            default:
                long j3 = this.f26108c;
                VideoCapturerDevice.h(this.f26107b, this.d, j3);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f26107b = videoCapturerDevice;
        this.f26108c = j3;
        this.d = i7;
    }
}
