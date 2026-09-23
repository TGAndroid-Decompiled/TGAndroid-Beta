package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f17649a;
    public final VideoCapturerDevice f17650b;

    public j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f17649a = i10;
        this.f17650b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f17649a) {
            case 0:
                VideoCapturerDevice.f(this.f17650b);
                return;
            default:
                VideoCapturerDevice.i(this.f17650b);
                return;
        }
    }
}
