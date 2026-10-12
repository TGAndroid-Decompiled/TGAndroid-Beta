package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18812a = 0;
    public final VideoCapturerDevice f18813b;
    public final long f18814c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18813b = videoCapturerDevice;
        this.d = i10;
        this.f18814c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18812a) {
            case 0:
                VideoCapturerDevice.b(this.f18813b, this.d, this.f18814c);
                return;
            default:
                long j10 = this.f18814c;
                VideoCapturerDevice.h(this.f18813b, this.d, j10);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18813b = videoCapturerDevice;
        this.f18814c = j10;
        this.d = i10;
    }
}
