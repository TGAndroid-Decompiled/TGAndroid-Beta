package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f18662a = 0;
    public final VideoCapturerDevice f18663b;
    public final long f18664c;
    public final int d;

    public j(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f18663b = videoCapturerDevice;
        this.d = i10;
        this.f18664c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18662a) {
            case 0:
                VideoCapturerDevice.b(this.f18663b, this.d, this.f18664c);
                return;
            default:
                long j10 = this.f18664c;
                VideoCapturerDevice.h(this.f18663b, this.d, j10);
                return;
        }
    }

    public j(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f18663b = videoCapturerDevice;
        this.f18664c = j10;
        this.d = i10;
    }
}
