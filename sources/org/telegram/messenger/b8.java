package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17933a;
    public final MediaDataController f17934b;
    public final boolean f17935c;

    public b8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17933a = i10;
        this.f17934b = mediaDataController;
        this.f17935c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17933a) {
            case 0:
                MediaDataController.O2(this.f17934b, this.f17935c);
                return;
            default:
                MediaDataController.I1(this.f17934b, this.f17935c);
                return;
        }
    }
}
