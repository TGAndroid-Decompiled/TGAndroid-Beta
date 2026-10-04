package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17314a;
    public final MediaDataController f17315b;
    public final int f17316c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17314a = i11;
        this.f17315b = mediaDataController;
        this.f17316c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17314a) {
            case 0:
                MediaDataController.O1(this.f17315b, this.f17316c);
                return;
            default:
                MediaDataController.e(this.f17315b, this.f17316c);
                return;
        }
    }
}
