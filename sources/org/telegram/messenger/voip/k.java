package org.telegram.messenger.voip;
public final class k implements Runnable {
    public final int f18829a;
    public final VideoCapturerDevice f18830b;

    public k(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18829a = i10;
        this.f18830b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18829a) {
            case 0:
                VideoCapturerDevice.f(this.f18830b);
                return;
            default:
                VideoCapturerDevice.i(this.f18830b);
                return;
        }
    }
}
