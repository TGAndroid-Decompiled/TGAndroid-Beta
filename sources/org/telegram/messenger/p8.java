package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f17784a;
    public final MediaDataController f17785b;
    public final boolean f17786c;
    public final int d;

    public p8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17784a = i11;
        this.f17785b = mediaDataController;
        this.f17786c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17784a) {
            case 0:
                this.f17785b.lambda$loadRecents$49(this.f17786c, this.d);
                return;
            case 1:
                this.f17785b.lambda$processLoadedFeaturedStickers$62(this.f17786c, this.d);
                return;
            default:
                this.f17785b.lambda$loadFeaturedStickers$56(this.f17786c, this.d);
                return;
        }
    }
}
