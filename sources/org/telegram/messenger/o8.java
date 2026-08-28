package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f21120a;
    public final MediaDataController f21121b;
    public final boolean f21122c;
    public final int d;

    public o8(MediaDataController mediaDataController, boolean z10, int i9, int i10) {
        this.f21120a = i10;
        this.f21121b = mediaDataController;
        this.f21122c = z10;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f21120a) {
            case 0:
                this.f21121b.lambda$loadRecents$49(this.f21122c, this.d);
                return;
            case 1:
                this.f21121b.lambda$processLoadedFeaturedStickers$62(this.f21122c, this.d);
                return;
            default:
                this.f21121b.lambda$loadFeaturedStickers$56(this.f21122c, this.d);
                return;
        }
    }
}
