package org.telegram.messenger;
public final class u8 implements Runnable {
    public final int f20174a;
    public final MediaDataController f20175b;
    public final boolean f20176c;
    public final int d;

    public u8(MediaDataController mediaDataController, boolean z4, int i10, int i11) {
        this.f20174a = i11;
        this.f20175b = mediaDataController;
        this.f20176c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20174a) {
            case 0:
                this.f20175b.lambda$loadRecents$49(this.f20176c, this.d);
                return;
            case 1:
                this.f20175b.lambda$processLoadedFeaturedStickers$62(this.f20176c, this.d);
                return;
            default:
                this.f20175b.lambda$loadFeaturedStickers$56(this.f20176c, this.d);
                return;
        }
    }
}
