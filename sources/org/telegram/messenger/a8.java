package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17844a;
    public final MediaDataController f17845b;
    public final boolean f17846c;

    public a8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17844a = i10;
        this.f17845b = mediaDataController;
        this.f17846c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17844a) {
            case 0:
                MediaDataController.O2(this.f17845b, this.f17846c);
                return;
            default:
                MediaDataController.I1(this.f17845b, this.f17846c);
                return;
        }
    }
}
