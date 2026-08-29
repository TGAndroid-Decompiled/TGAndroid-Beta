package org.telegram.messenger;
public final class t8 implements Runnable {
    public final int f21625a;
    public final MediaDataController f21626b;
    public final boolean f21627c;
    public final int d;

    public t8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f21625a = i11;
        this.f21626b = mediaDataController;
        this.f21627c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21625a) {
            case 0:
                this.f21626b.lambda$loadRecents$49(this.f21627c, this.d);
                return;
            case 1:
                this.f21626b.lambda$processLoadedFeaturedStickers$62(this.f21627c, this.d);
                return;
            default:
                this.f21626b.lambda$loadFeaturedStickers$56(this.f21627c, this.d);
                return;
        }
    }
}
