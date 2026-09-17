package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17260a;
    public final MediaDataController f17261b;
    public final boolean f17262c;

    public b8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17260a = i10;
        this.f17261b = mediaDataController;
        this.f17262c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17260a) {
            case 0:
                MediaDataController.S2(this.f17261b, this.f17262c);
                return;
            default:
                MediaDataController.N1(this.f17261b, this.f17262c);
                return;
        }
    }
}
