package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19865a = 0;
    public final VideoCapturerDevice f19866b;
    public final long f19867c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19866b = videoCapturerDevice;
        this.d = i10;
        this.f19867c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19865a) {
            case 0:
                VideoCapturerDevice.b(this.f19866b, this.d, this.f19867c);
                return;
            default:
                long j10 = this.f19867c;
                VideoCapturerDevice.h(this.f19866b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19866b = videoCapturerDevice;
        this.f19867c = j10;
        this.d = i10;
    }
}
