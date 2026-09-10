package org.telegram.messenger.voip;
public final class l implements Runnable {
    public final int f16750a;
    public final VideoCapturerDevice f16751b;

    public l(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f16750a = i10;
        this.f16751b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f16750a) {
            case 0:
                VideoCapturerDevice.f(this.f16751b);
                return;
            default:
                VideoCapturerDevice.i(this.f16751b);
                return;
        }
    }
}
