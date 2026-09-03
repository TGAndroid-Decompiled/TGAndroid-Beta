package org.telegram.messenger;
public final class u8 implements Runnable {
    public final int f20176a;
    public final MediaDataController f20177b;
    public final boolean f20178c;
    public final int d;

    public u8(MediaDataController mediaDataController, boolean z4, int i10, int i11) {
        this.f20176a = i11;
        this.f20177b = mediaDataController;
        this.f20178c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20176a) {
            case 0:
                this.f20177b.lambda$loadRecents$49(this.f20178c, this.d);
                return;
            case 1:
                this.f20177b.lambda$processLoadedFeaturedStickers$62(this.f20178c, this.d);
                return;
            default:
                this.f20177b.lambda$loadFeaturedStickers$56(this.f20178c, this.d);
                return;
        }
    }
}
