package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f16999a;
    public final MediaDataController f17000b;
    public final boolean f17001c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f16999a = i11;
        this.f17000b = mediaDataController;
        this.f17001c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16999a) {
            case 0:
                this.f17000b.lambda$loadRecents$49(this.f17001c, this.d);
                return;
            case 1:
                this.f17000b.lambda$processLoadedFeaturedStickers$62(this.f17001c, this.d);
                return;
            default:
                this.f17000b.lambda$loadFeaturedStickers$56(this.f17001c, this.d);
                return;
        }
    }
}
