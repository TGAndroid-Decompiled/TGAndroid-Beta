package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17213a;
    public final MediaDataController f17214b;
    public final boolean f17215c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17213a = i11;
        this.f17214b = mediaDataController;
        this.f17215c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17213a) {
            case 0:
                this.f17214b.lambda$loadRecents$49(this.f17215c, this.d);
                return;
            case 1:
                this.f17214b.lambda$processLoadedFeaturedStickers$62(this.f17215c, this.d);
                return;
            default:
                this.f17214b.lambda$loadFeaturedStickers$56(this.f17215c, this.d);
                return;
        }
    }
}
