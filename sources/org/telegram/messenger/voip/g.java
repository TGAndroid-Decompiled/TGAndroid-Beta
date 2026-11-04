package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f26003a = 0;
    public final VideoCapturerDevice f26004b;
    public final long f26005c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i3, long j10) {
        this.f26004b = videoCapturerDevice;
        this.d = i3;
        this.f26005c = j10;
    }

    @Override
    public final void run() {
        switch (this.f26003a) {
            case 0:
                VideoCapturerDevice.b(this.f26004b, this.d, this.f26005c);
                return;
            default:
                long j10 = this.f26005c;
                VideoCapturerDevice.h(this.f26004b, this.d, j10);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i3) {
        this.f26004b = videoCapturerDevice;
        this.f26005c = j10;
        this.d = i3;
    }
}
