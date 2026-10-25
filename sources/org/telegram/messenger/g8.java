package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f20149a;
    public final MediaDataController f20150b;
    public final boolean f20151c;

    public g8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f20149a = i10;
        this.f20150b = mediaDataController;
        this.f20151c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20149a) {
            case 0:
                this.f20150b.lambda$loadFeaturedStickers$55(this.f20151c);
                return;
            default:
                this.f20150b.lambda$processLoadedFeaturedStickers$59(this.f20151c);
                return;
        }
    }
}
