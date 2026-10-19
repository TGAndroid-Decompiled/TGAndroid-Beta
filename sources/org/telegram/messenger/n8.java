package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f19029a;
    public final MediaDataController f19030b;
    public final boolean f19031c;
    public final int d;

    public n8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19029a = i11;
        this.f19030b = mediaDataController;
        this.f19031c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19029a) {
            case 0:
                this.f19030b.lambda$loadRecents$49(this.f19031c, this.d);
                return;
            case 1:
                this.f19030b.lambda$processLoadedFeaturedStickers$62(this.f19031c, this.d);
                return;
            default:
                this.f19030b.lambda$loadFeaturedStickers$56(this.f19031c, this.d);
                return;
        }
    }
}
