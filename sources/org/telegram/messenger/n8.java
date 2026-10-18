package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f19026a;
    public final MediaDataController f19027b;
    public final boolean f19028c;
    public final int d;

    public n8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f19026a = i11;
        this.f19027b = mediaDataController;
        this.f19028c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19026a) {
            case 0:
                this.f19027b.lambda$loadRecents$49(this.f19028c, this.d);
                return;
            case 1:
                this.f19027b.lambda$processLoadedFeaturedStickers$62(this.f19028c, this.d);
                return;
            default:
                this.f19027b.lambda$loadFeaturedStickers$56(this.f19028c, this.d);
                return;
        }
    }
}
