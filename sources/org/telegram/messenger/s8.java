package org.telegram.messenger;
public final class s8 implements Runnable {
    public final int f21211a;
    public final MediaDataController f21212b;
    public final boolean f21213c;
    public final int d;

    public s8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f21211a = i11;
        this.f21212b = mediaDataController;
        this.f21213c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21211a) {
            case 0:
                this.f21212b.lambda$loadRecents$49(this.f21213c, this.d);
                return;
            case 1:
                this.f21212b.lambda$processLoadedFeaturedStickers$62(this.f21213c, this.d);
                return;
            default:
                this.f21212b.lambda$loadFeaturedStickers$56(this.f21213c, this.d);
                return;
        }
    }
}
