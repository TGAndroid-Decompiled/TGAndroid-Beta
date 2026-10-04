package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f19559a = 0;
    public final VideoCapturerDevice f19560b;
    public final long f19561c;
    public final int d;

    public i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.f19560b = videoCapturerDevice;
        this.d = i10;
        this.f19561c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19559a) {
            case 0:
                VideoCapturerDevice.b(this.f19560b, this.d, this.f19561c);
                return;
            default:
                long j3 = this.f19561c;
                VideoCapturerDevice.h(this.f19560b, this.d, j3);
                return;
        }
    }

    public i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.f19560b = videoCapturerDevice;
        this.f19561c = j3;
        this.d = i10;
    }
}
