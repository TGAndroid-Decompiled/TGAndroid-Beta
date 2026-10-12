package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f18550a;
    public final MediaDataController f18551b;
    public final boolean f18552c;
    public final int d;

    public p8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18550a = i11;
        this.f18551b = mediaDataController;
        this.f18552c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18550a) {
            case 0:
                this.f18551b.lambda$loadRecents$49(this.f18552c, this.d);
                return;
            case 1:
                this.f18551b.lambda$processLoadedFeaturedStickers$62(this.f18552c, this.d);
                return;
            default:
                this.f18551b.lambda$loadFeaturedStickers$56(this.f18552c, this.d);
                return;
        }
    }
}
