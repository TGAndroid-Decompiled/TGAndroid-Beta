package defpackage;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class icc implements Runnable {
    public final byte a = 0;
    public final VideoCapturerDevice b;
    public final long c;
    public final int d;

    public icc(VideoCapturerDevice videoCapturerDevice, int i, long j) {
        this.b = videoCapturerDevice;
        this.d = i;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        VideoCapturerDevice videoCapturerDevice = this.b;
        switch (b) {
            case 0:
                VideoCapturerDevice.b(videoCapturerDevice, i, j);
                return;
            default:
                VideoCapturerDevice.h(videoCapturerDevice, i, j);
                return;
        }
    }

    public icc(VideoCapturerDevice videoCapturerDevice, long j, int i) {
        this.b = videoCapturerDevice;
        this.c = j;
        this.d = i;
    }
}
