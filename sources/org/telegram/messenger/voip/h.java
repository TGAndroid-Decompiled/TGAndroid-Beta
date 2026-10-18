package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19871a = 0;
    public final VideoCapturerDevice f19872b;
    public final long f19873c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19872b = videoCapturerDevice;
        this.d = i10;
        this.f19873c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                VideoCapturerDevice.b(this.f19872b, this.d, this.f19873c);
                return;
            default:
                long j10 = this.f19873c;
                VideoCapturerDevice.h(this.f19872b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19872b = videoCapturerDevice;
        this.f19873c = j10;
        this.d = i10;
    }
}
