package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16640a;
    public final MediaDataController f16641b;
    public final boolean f16642c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16640a = i10;
        this.f16641b = mediaDataController;
        this.f16642c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16640a) {
            case 0:
                this.f16641b.lambda$loadFeaturedStickers$55(this.f16642c);
                return;
            default:
                this.f16641b.lambda$processLoadedFeaturedStickers$59(this.f16642c);
                return;
        }
    }
}
