package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f26007a;
    public final VideoCapturerDevice f26008b;

    public h(VideoCapturerDevice videoCapturerDevice, int i3) {
        this.f26007a = i3;
        this.f26008b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f26007a) {
            case 0:
                VideoCapturerDevice.f(this.f26008b);
                return;
            default:
                VideoCapturerDevice.i(this.f26008b);
                return;
        }
    }
}
