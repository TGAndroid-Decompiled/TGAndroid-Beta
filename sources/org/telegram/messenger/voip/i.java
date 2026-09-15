package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f17661a = 0;
    public final VideoCapturerDevice f17662b;
    public final long f17663c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f17662b = videoCapturerDevice;
        this.d = i10;
        this.f17663c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17661a) {
            case 0:
                VideoCapturerDevice.b(this.f17662b, this.d, this.f17663c);
                return;
            default:
                long j3 = this.f17663c;
                VideoCapturerDevice.h(this.f17662b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f17662b = videoCapturerDevice;
        this.f17663c = j3;
        this.d = i10;
    }
}
