package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17450a;
    public final MediaDataController f17451b;
    public final boolean f17452c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17450a = i11;
        this.f17451b = mediaDataController;
        this.f17452c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17450a) {
            case 0:
                this.f17451b.lambda$loadRecents$49(this.f17452c, this.d);
                return;
            case 1:
                this.f17451b.lambda$processLoadedFeaturedStickers$62(this.f17452c, this.d);
                return;
            default:
                this.f17451b.lambda$loadFeaturedStickers$56(this.f17452c, this.d);
                return;
        }
    }
}
