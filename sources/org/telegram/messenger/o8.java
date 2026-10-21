package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f19120a;
    public final MediaDataController f19121b;
    public final boolean f19122c;
    public final int d;

    public o8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19120a = i11;
        this.f19121b = mediaDataController;
        this.f19122c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19120a) {
            case 0:
                this.f19121b.lambda$loadRecents$49(this.f19122c, this.d);
                return;
            case 1:
                this.f19121b.lambda$processLoadedFeaturedStickers$62(this.f19122c, this.d);
                return;
            default:
                this.f19121b.lambda$loadFeaturedStickers$56(this.f19122c, this.d);
                return;
        }
    }
}
