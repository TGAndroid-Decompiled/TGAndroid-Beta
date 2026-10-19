package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17850a;
    public final MediaDataController f17851b;
    public final boolean f17852c;

    public a8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17850a = i10;
        this.f17851b = mediaDataController;
        this.f17852c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17850a) {
            case 0:
                MediaDataController.O2(this.f17851b, this.f17852c);
                return;
            default:
                MediaDataController.I1(this.f17851b, this.f17852c);
                return;
        }
    }
}
