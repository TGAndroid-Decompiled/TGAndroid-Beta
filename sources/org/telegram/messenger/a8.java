package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17853a;
    public final MediaDataController f17854b;
    public final boolean f17855c;

    public a8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17853a = i10;
        this.f17854b = mediaDataController;
        this.f17855c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17853a) {
            case 0:
                MediaDataController.O2(this.f17854b, this.f17855c);
                return;
            default:
                MediaDataController.I1(this.f17854b, this.f17855c);
                return;
        }
    }
}
