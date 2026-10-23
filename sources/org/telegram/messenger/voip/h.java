package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19883a = 0;
    public final VideoCapturerDevice f19884b;
    public final long f19885c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19884b = videoCapturerDevice;
        this.d = i10;
        this.f19885c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19883a) {
            case 0:
                VideoCapturerDevice.b(this.f19884b, this.d, this.f19885c);
                return;
            default:
                long j10 = this.f19885c;
                VideoCapturerDevice.h(this.f19884b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19884b = videoCapturerDevice;
        this.f19885c = j10;
        this.d = i10;
    }
}
