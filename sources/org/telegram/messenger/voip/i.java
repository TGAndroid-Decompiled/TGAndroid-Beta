package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18509a = 0;
    public final VideoCapturerDevice f18510b;
    public final long f18511c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18510b = videoCapturerDevice;
        this.d = i10;
        this.f18511c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18509a) {
            case 0:
                VideoCapturerDevice.b(this.f18510b, this.d, this.f18511c);
                return;
            default:
                long j10 = this.f18511c;
                VideoCapturerDevice.h(this.f18510b, this.d, j10);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18510b = videoCapturerDevice;
        this.f18511c = j10;
        this.d = i10;
    }
}
