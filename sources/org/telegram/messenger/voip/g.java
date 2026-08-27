package org.telegram.messenger.voip;

public final class g implements Runnable {

    public final int f21909a = 0;

    public final VideoCapturerDevice f21910b;

    public final long f21911c;
    public final int d;

    public g(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.f21910b = videoCapturerDevice;
        this.d = i10;
        this.f21911c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21909a) {
            case 0:
                this.f21910b.lambda$onStateChanged$6(this.d, this.f21911c);
                break;
            default:
                this.f21910b.lambda$onStateChanged$7(this.f21911c, this.d);
                break;
        }
    }

    public g(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.f21910b = videoCapturerDevice;
        this.f21911c = j10;
        this.d = i10;
    }
}
