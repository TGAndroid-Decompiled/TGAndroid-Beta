package org.telegram.messenger;
public final class t8 implements Runnable {
    public final int f21281a;
    public final MediaDataController f21282b;
    public final boolean f21283c;
    public final int d;

    public t8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f21281a = i11;
        this.f21282b = mediaDataController;
        this.f21283c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21281a) {
            case 0:
                this.f21282b.lambda$loadRecents$49(this.f21283c, this.d);
                return;
            case 1:
                this.f21282b.lambda$processLoadedFeaturedStickers$62(this.f21283c, this.d);
                return;
            default:
                this.f21282b.lambda$loadFeaturedStickers$56(this.f21283c, this.d);
                return;
        }
    }
}
