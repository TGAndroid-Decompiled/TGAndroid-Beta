package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f18084a;
    public final MediaDataController f18085b;
    public final boolean f18086c;
    public final int d;

    public p8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18084a = i11;
        this.f18085b = mediaDataController;
        this.f18086c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18084a) {
            case 0:
                this.f18085b.lambda$loadRecents$49(this.f18086c, this.d);
                return;
            case 1:
                this.f18085b.lambda$processLoadedFeaturedStickers$62(this.f18086c, this.d);
                return;
            default:
                this.f18085b.lambda$loadFeaturedStickers$56(this.f18086c, this.d);
                return;
        }
    }
}
