package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f19434a;
    public final MediaDataController f19435b;
    public final boolean f19436c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19434a = i11;
        this.f19435b = mediaDataController;
        this.f19436c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19434a) {
            case 0:
                this.f19435b.lambda$loadRecents$49(this.f19436c, this.d);
                return;
            case 1:
                this.f19435b.lambda$processLoadedFeaturedStickers$62(this.f19436c, this.d);
                return;
            default:
                this.f19435b.lambda$loadFeaturedStickers$56(this.f19436c, this.d);
                return;
        }
    }
}
