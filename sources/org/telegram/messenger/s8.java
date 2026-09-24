package org.telegram.messenger;
public final class s8 implements Runnable {
    public final int f17504a;
    public final MediaDataController f17505b;
    public final boolean f17506c;
    public final int d;

    public s8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17504a = i11;
        this.f17505b = mediaDataController;
        this.f17506c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17504a) {
            case 0:
                this.f17505b.lambda$loadRecents$49(this.f17506c, this.d);
                return;
            case 1:
                this.f17505b.lambda$processLoadedFeaturedStickers$62(this.f17506c, this.d);
                return;
            default:
                this.f17505b.lambda$loadFeaturedStickers$56(this.f17506c, this.d);
                return;
        }
    }
}
