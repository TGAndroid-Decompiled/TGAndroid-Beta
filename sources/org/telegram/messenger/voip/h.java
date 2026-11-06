package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f26110a;
    public final VideoCapturerDevice f26111b;

    public h(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f26110a = i7;
        this.f26111b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f26110a) {
            case 0:
                VideoCapturerDevice.f(this.f26111b);
                return;
            default:
                VideoCapturerDevice.i(this.f26111b);
                return;
        }
    }
}
