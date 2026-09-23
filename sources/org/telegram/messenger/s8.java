package org.telegram.messenger;
public final class s8 implements Runnable {
    public final int f17272a;
    public final MediaDataController f17273b;
    public final boolean f17274c;
    public final int d;

    public s8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17272a = i11;
        this.f17273b = mediaDataController;
        this.f17274c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17272a) {
            case 0:
                this.f17273b.lambda$loadRecents$49(this.f17274c, this.d);
                return;
            case 1:
                this.f17273b.lambda$processLoadedFeaturedStickers$62(this.f17274c, this.d);
                return;
            default:
                this.f17273b.lambda$loadFeaturedStickers$56(this.f17274c, this.d);
                return;
        }
    }
}
