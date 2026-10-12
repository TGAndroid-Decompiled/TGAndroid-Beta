package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16943a;
    public final MediaDataController f16944b;
    public final boolean f16945c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16943a = i10;
        this.f16944b = mediaDataController;
        this.f16945c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16943a) {
            case 0:
                this.f16944b.lambda$loadFeaturedStickers$55(this.f16945c);
                return;
            default:
                this.f16944b.lambda$processLoadedFeaturedStickers$59(this.f16945c);
                return;
        }
    }
}
