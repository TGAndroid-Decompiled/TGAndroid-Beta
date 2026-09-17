package org.telegram.messenger;
public final class r8 implements Runnable {
    public final int f17222a;
    public final MediaDataController f17223b;
    public final boolean f17224c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17222a = i11;
        this.f17223b = mediaDataController;
        this.f17224c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17222a) {
            case 0:
                this.f17223b.lambda$loadRecents$49(this.f17224c, this.d);
                return;
            case 1:
                this.f17223b.lambda$processLoadedFeaturedStickers$62(this.f17224c, this.d);
                return;
            default:
                this.f17223b.lambda$loadFeaturedStickers$56(this.f17224c, this.d);
                return;
        }
    }
}
