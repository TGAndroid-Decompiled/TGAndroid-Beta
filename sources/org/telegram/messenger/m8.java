package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f16998a;
    public final MediaDataController f16999b;
    public final boolean f17000c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f16998a = i11;
        this.f16999b = mediaDataController;
        this.f17000c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16998a) {
            case 0:
                this.f16999b.lambda$loadRecents$49(this.f17000c, this.d);
                return;
            case 1:
                this.f16999b.lambda$processLoadedFeaturedStickers$62(this.f17000c, this.d);
                return;
            default:
                this.f16999b.lambda$loadFeaturedStickers$56(this.f17000c, this.d);
                return;
        }
    }
}
