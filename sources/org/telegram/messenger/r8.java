package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17435a;
    public final MediaDataController f17436b;
    public final boolean f17437c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17435a = i11;
        this.f17436b = mediaDataController;
        this.f17437c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17435a) {
            case 0:
                this.f17436b.lambda$loadRecents$49(this.f17437c, this.d);
                return;
            case 1:
                this.f17436b.lambda$processLoadedFeaturedStickers$62(this.f17437c, this.d);
                return;
            default:
                this.f17436b.lambda$loadFeaturedStickers$56(this.f17437c, this.d);
                return;
        }
    }
}
