package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17665a;
    public final VideoCapturerDevice f17666b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17665a = i10;
        this.f17666b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17665a) {
            case 0:
                VideoCapturerDevice.f(this.f17666b);
                return;
            default:
                VideoCapturerDevice.i(this.f17666b);
                return;
        }
    }
}
