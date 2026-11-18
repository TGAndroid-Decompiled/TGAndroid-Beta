package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f27504a;
    public final VideoCapturerDevice f27505b;

    public i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.f27504a = i7;
        this.f27505b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f27504a) {
            case 0:
                VideoCapturerDevice.f(this.f27505b);
                return;
            default:
                VideoCapturerDevice.i(this.f27505b);
                return;
        }
    }
}
