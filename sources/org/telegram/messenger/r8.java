package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f18895a;
    public final MediaDataController f18896b;
    public final boolean f18897c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18895a = i11;
        this.f18896b = mediaDataController;
        this.f18897c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18895a) {
            case 0:
                this.f18896b.lambda$loadRecents$49(this.f18897c, this.d);
                return;
            case 1:
                this.f18896b.lambda$processLoadedFeaturedStickers$62(this.f18897c, this.d);
                return;
            default:
                this.f18896b.lambda$loadFeaturedStickers$56(this.f18897c, this.d);
                return;
        }
    }
}
