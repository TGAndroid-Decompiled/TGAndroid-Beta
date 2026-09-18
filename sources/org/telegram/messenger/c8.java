package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16005a;
    public final MediaDataController f16006b;
    public final boolean f16007c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16005a = i10;
        this.f16006b = mediaDataController;
        this.f16007c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16005a) {
            case 0:
                this.f16006b.lambda$loadFeaturedStickers$55(this.f16007c);
                return;
            default:
                this.f16006b.lambda$processLoadedFeaturedStickers$59(this.f16007c);
                return;
        }
    }
}
