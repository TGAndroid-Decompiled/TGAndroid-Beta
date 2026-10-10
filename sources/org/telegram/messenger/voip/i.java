package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19574a = 0;
    public final VideoCapturerDevice f19575b;
    public final long f19576c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19575b = videoCapturerDevice;
        this.d = i10;
        this.f19576c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19574a) {
            case 0:
                VideoCapturerDevice.b(this.f19575b, this.d, this.f19576c);
                return;
            default:
                long j3 = this.f19576c;
                VideoCapturerDevice.h(this.f19575b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19575b = videoCapturerDevice;
        this.f19576c = j3;
        this.d = i10;
    }
}
