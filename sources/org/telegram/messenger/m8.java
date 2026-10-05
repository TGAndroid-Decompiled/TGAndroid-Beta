package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18558a;
    public final MediaDataController f18559b;
    public final boolean f18560c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18558a = i11;
        this.f18559b = mediaDataController;
        this.f18560c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18558a) {
            case 0:
                this.f18559b.lambda$loadRecents$49(this.f18560c, this.d);
                return;
            case 1:
                this.f18559b.lambda$processLoadedFeaturedStickers$62(this.f18560c, this.d);
                return;
            default:
                this.f18559b.lambda$loadFeaturedStickers$56(this.f18560c, this.d);
                return;
        }
    }
}
