package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f26120a = 0;
    public final VideoCapturerDevice f26121b;
    public final long f26122c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f26121b = videoCapturerDevice;
        this.d = i7;
        this.f26122c = j3;
    }

    @Override
    public final void run() {
        switch (this.f26120a) {
            case 0:
                VideoCapturerDevice.b(this.f26121b, this.d, this.f26122c);
                return;
            default:
                long j3 = this.f26122c;
                VideoCapturerDevice.h(this.f26121b, this.d, j3);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f26121b = videoCapturerDevice;
        this.f26122c = j3;
        this.d = i7;
    }
}
