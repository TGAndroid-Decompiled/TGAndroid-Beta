package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f19123a;
    public final MediaDataController f19124b;
    public final boolean f19125c;
    public final int d;

    public o8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19123a = i11;
        this.f19124b = mediaDataController;
        this.f19125c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                this.f19124b.lambda$loadRecents$49(this.f19125c, this.d);
                return;
            case 1:
                this.f19124b.lambda$processLoadedFeaturedStickers$62(this.f19125c, this.d);
                return;
            default:
                this.f19124b.lambda$loadFeaturedStickers$56(this.f19125c, this.d);
                return;
        }
    }
}
