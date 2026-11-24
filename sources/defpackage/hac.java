package defpackage;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class hac implements Runnable {
    public final byte a;
    public final VideoCapturerDevice b;

    public hac(VideoCapturerDevice videoCapturerDevice, byte b) {
        this.a = b;
        this.b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoCapturerDevice videoCapturerDevice = this.b;
        switch (b) {
            case 0:
                videoCapturerDevice.lambda$onDestroy$8();
                return;
            default:
                videoCapturerDevice.lambda$onDestroy$9();
                return;
        }
    }
}
