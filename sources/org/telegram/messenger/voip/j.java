package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f18822a = 0;
    public final VideoCapturerDevice f18823b;
    public final long f18824c;
    public final int d;

    public j(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18823b = videoCapturerDevice;
        this.d = i10;
        this.f18824c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18822a) {
            case 0:
                VideoCapturerDevice.b(this.f18823b, this.d, this.f18824c);
                return;
            default:
                long j10 = this.f18824c;
                VideoCapturerDevice.h(this.f18823b, this.d, j10);
                return;
        }
    }

    public j(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18823b = videoCapturerDevice;
        this.f18824c = j10;
        this.d = i10;
    }
}
