package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f21889a;
    public final VideoCapturerDevice f21890b;

    public h(VideoCapturerDevice videoCapturerDevice, int i9) {
        this.f21889a = i9;
        this.f21890b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f21889a) {
            case 0:
                VideoCapturerDevice.f(this.f21890b);
                return;
            default:
                VideoCapturerDevice.i(this.f21890b);
                return;
        }
    }
}
