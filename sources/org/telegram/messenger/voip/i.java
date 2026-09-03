package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18772a;
    public final VideoCapturerDevice f18773b;

    public i(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.f18772a = i10;
        this.f18773b = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.f18772a) {
            case 0:
                this.f18773b.lambda$onDestroy$8();
                return;
            default:
                this.f18773b.lambda$onDestroy$9();
                return;
        }
    }
}
