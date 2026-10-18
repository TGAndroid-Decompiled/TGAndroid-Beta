package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18950a;
    public final MediaDataController f18951b;
    public final boolean f18952c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18950a = i11;
        this.f18951b = mediaDataController;
        this.f18952c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18950a) {
            case 0:
                this.f18951b.lambda$loadRecents$49(this.f18952c, this.d);
                return;
            case 1:
                this.f18951b.lambda$processLoadedFeaturedStickers$62(this.f18952c, this.d);
                return;
            default:
                this.f18951b.lambda$loadFeaturedStickers$56(this.f18952c, this.d);
                return;
        }
    }
}
