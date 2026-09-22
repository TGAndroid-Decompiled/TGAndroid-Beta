package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16053a;
    public final MediaDataController f16054b;
    public final boolean f16055c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16053a = i10;
        this.f16054b = mediaDataController;
        this.f16055c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16053a) {
            case 0:
                this.f16054b.lambda$loadFeaturedStickers$55(this.f16055c);
                return;
            default:
                this.f16054b.lambda$processLoadedFeaturedStickers$59(this.f16055c);
                return;
        }
    }
}
