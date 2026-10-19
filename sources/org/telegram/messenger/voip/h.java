package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19868a = 0;
    public final VideoCapturerDevice f19869b;
    public final long f19870c;
    public final int d;

    public h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f19869b = videoCapturerDevice;
        this.d = i10;
        this.f19870c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19868a) {
            case 0:
                VideoCapturerDevice.b(this.f19869b, this.d, this.f19870c);
                return;
            default:
                long j10 = this.f19870c;
                VideoCapturerDevice.h(this.f19869b, this.d, j10);
                return;
        }
    }

    public h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f19869b = videoCapturerDevice;
        this.f19870c = j10;
        this.d = i10;
    }
}
