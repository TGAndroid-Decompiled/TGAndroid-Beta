package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f26114a = 0;
    public final VideoCapturerDevice f26115b;
    public final long f26116c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.f26115b = videoCapturerDevice;
        this.d = i7;
        this.f26116c = j3;
    }

    @Override
    public final void run() {
        switch (this.f26114a) {
            case 0:
                VideoCapturerDevice.b(this.f26115b, this.d, this.f26116c);
                return;
            default:
                long j3 = this.f26116c;
                VideoCapturerDevice.h(this.f26115b, this.d, j3);
                return;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.f26115b = videoCapturerDevice;
        this.f26116c = j3;
        this.d = i7;
    }
}
