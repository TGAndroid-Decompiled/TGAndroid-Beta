package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17931a = 0;
    public final VideoCapturerDevice f17932b;
    public final long f17933c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17932b = videoCapturerDevice;
        this.d = i10;
        this.f17933c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17931a) {
            case 0:
                VideoCapturerDevice.b(this.f17932b, this.d, this.f17933c);
                return;
            default:
                long j3 = this.f17933c;
                VideoCapturerDevice.h(this.f17932b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17932b = videoCapturerDevice;
        this.f17933c = j3;
        this.d = i10;
    }
}
