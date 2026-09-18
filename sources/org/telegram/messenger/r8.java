package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17394a;
    public final MediaDataController f17395b;
    public final boolean f17396c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17394a = i11;
        this.f17395b = mediaDataController;
        this.f17396c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17394a) {
            case 0:
                this.f17395b.lambda$loadRecents$49(this.f17396c, this.d);
                return;
            case 1:
                this.f17395b.lambda$processLoadedFeaturedStickers$62(this.f17396c, this.d);
                return;
            default:
                this.f17395b.lambda$loadFeaturedStickers$56(this.f17396c, this.d);
                return;
        }
    }
}
