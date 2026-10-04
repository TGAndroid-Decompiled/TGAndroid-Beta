package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18556a;
    public final MediaDataController f18557b;
    public final boolean f18558c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18556a = i11;
        this.f18557b = mediaDataController;
        this.f18558c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18556a) {
            case 0:
                this.f18557b.lambda$loadRecents$49(this.f18558c, this.d);
                return;
            case 1:
                this.f18557b.lambda$processLoadedFeaturedStickers$62(this.f18558c, this.d);
                return;
            default:
                this.f18557b.lambda$loadFeaturedStickers$56(this.f18558c, this.d);
                return;
        }
    }
}
