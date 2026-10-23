package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f19292a;
    public final MediaDataController f19293b;
    public final boolean f19294c;
    public final int d;

    public q8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19292a = i11;
        this.f19293b = mediaDataController;
        this.f19294c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                this.f19293b.lambda$loadRecents$49(this.f19294c, this.d);
                return;
            case 1:
                this.f19293b.lambda$processLoadedFeaturedStickers$62(this.f19294c, this.d);
                return;
            default:
                this.f19293b.lambda$loadFeaturedStickers$56(this.f19294c, this.d);
                return;
        }
    }
}
