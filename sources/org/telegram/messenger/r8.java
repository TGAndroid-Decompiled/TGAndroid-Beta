package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f18868a;
    public final MediaDataController f18869b;
    public final boolean f18870c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18868a = i11;
        this.f18869b = mediaDataController;
        this.f18870c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18868a) {
            case 0:
                this.f18869b.lambda$loadRecents$49(this.f18870c, this.d);
                return;
            case 1:
                this.f18869b.lambda$processLoadedFeaturedStickers$62(this.f18870c, this.d);
                return;
            default:
                this.f18869b.lambda$loadFeaturedStickers$56(this.f18870c, this.d);
                return;
        }
    }
}
