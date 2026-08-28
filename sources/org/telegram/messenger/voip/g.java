package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f21885a = 0;
    public final VideoCapturerDevice f21886b;
    public final long f21887c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i9, long j10) {
        this.f21886b = videoCapturerDevice;
        this.d = i9;
        this.f21887c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21885a) {
            case 0:
                VideoCapturerDevice.b(this.f21886b, this.d, this.f21887c);
                return;
            default:
                long j10 = this.f21887c;
                VideoCapturerDevice.h(this.f21886b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i9) {
        this.f21886b = videoCapturerDevice;
        this.f21887c = j10;
        this.d = i9;
    }
}
