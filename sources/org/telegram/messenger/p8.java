package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f18549a;
    public final MediaDataController f18550b;
    public final boolean f18551c;
    public final int d;

    public p8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18549a = i11;
        this.f18550b = mediaDataController;
        this.f18551c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18549a) {
            case 0:
                this.f18550b.lambda$loadRecents$49(this.f18551c, this.d);
                return;
            case 1:
                this.f18550b.lambda$processLoadedFeaturedStickers$62(this.f18551c, this.d);
                return;
            default:
                this.f18550b.lambda$loadFeaturedStickers$56(this.f18551c, this.d);
                return;
        }
    }
}
