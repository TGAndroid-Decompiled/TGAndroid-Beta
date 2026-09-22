package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17900a = 0;
    public final VideoCapturerDevice f17901b;
    public final long f17902c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17901b = videoCapturerDevice;
        this.d = i10;
        this.f17902c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17900a) {
            case 0:
                VideoCapturerDevice.b(this.f17901b, this.d, this.f17902c);
                return;
            default:
                long j3 = this.f17902c;
                VideoCapturerDevice.h(this.f17901b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17901b = videoCapturerDevice;
        this.f17902c = j3;
        this.d = i10;
    }
}
