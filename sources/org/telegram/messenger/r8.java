package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17209a;
    public final MediaDataController f17210b;
    public final boolean f17211c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17209a = i11;
        this.f17210b = mediaDataController;
        this.f17211c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17209a) {
            case 0:
                this.f17210b.lambda$loadRecents$49(this.f17211c, this.d);
                return;
            case 1:
                this.f17210b.lambda$processLoadedFeaturedStickers$62(this.f17211c, this.d);
                return;
            default:
                this.f17210b.lambda$loadFeaturedStickers$56(this.f17211c, this.d);
                return;
        }
    }
}
