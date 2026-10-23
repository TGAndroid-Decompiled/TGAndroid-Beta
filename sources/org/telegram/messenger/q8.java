package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f19362a;
    public final MediaDataController f19363b;
    public final boolean f19364c;
    public final int d;

    public q8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19362a = i11;
        this.f19363b = mediaDataController;
        this.f19364c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19362a) {
            case 0:
                this.f19363b.lambda$loadRecents$49(this.f19364c, this.d);
                return;
            case 1:
                this.f19363b.lambda$processLoadedFeaturedStickers$62(this.f19364c, this.d);
                return;
            default:
                this.f19363b.lambda$loadFeaturedStickers$56(this.f19364c, this.d);
                return;
        }
    }
}
