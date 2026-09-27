package org.telegram.messenger;
public final class s8 implements Runnable {
    public final int f17513a;
    public final MediaDataController f17514b;
    public final boolean f17515c;
    public final int d;

    public s8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17513a = i11;
        this.f17514b = mediaDataController;
        this.f17515c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17513a) {
            case 0:
                this.f17514b.lambda$loadRecents$49(this.f17515c, this.d);
                return;
            case 1:
                this.f17514b.lambda$processLoadedFeaturedStickers$62(this.f17515c, this.d);
                return;
            default:
                this.f17514b.lambda$loadFeaturedStickers$56(this.f17515c, this.d);
                return;
        }
    }
}
