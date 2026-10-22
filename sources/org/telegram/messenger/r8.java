package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f19364a;
    public final MediaDataController f19365b;
    public final boolean f19366c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19364a = i11;
        this.f19365b = mediaDataController;
        this.f19366c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19364a) {
            case 0:
                this.f19365b.lambda$loadRecents$49(this.f19366c, this.d);
                return;
            case 1:
                this.f19365b.lambda$processLoadedFeaturedStickers$62(this.f19366c, this.d);
                return;
            default:
                this.f19365b.lambda$loadFeaturedStickers$56(this.f19366c, this.d);
                return;
        }
    }
}
