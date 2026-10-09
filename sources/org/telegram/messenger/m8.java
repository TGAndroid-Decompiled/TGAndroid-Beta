package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18502a;
    public final MediaDataController f18503b;
    public final boolean f18504c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18502a = i11;
        this.f18503b = mediaDataController;
        this.f18504c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18502a) {
            case 0:
                this.f18503b.lambda$loadRecents$49(this.f18504c, this.d);
                return;
            case 1:
                this.f18503b.lambda$processLoadedFeaturedStickers$62(this.f18504c, this.d);
                return;
            default:
                this.f18503b.lambda$loadFeaturedStickers$56(this.f18504c, this.d);
                return;
        }
    }
}
