package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18540a;
    public final MediaDataController f18541b;
    public final boolean f18542c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18540a = i11;
        this.f18541b = mediaDataController;
        this.f18542c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18540a) {
            case 0:
                this.f18541b.lambda$loadRecents$49(this.f18542c, this.d);
                return;
            case 1:
                this.f18541b.lambda$processLoadedFeaturedStickers$62(this.f18542c, this.d);
                return;
            default:
                this.f18541b.lambda$loadFeaturedStickers$56(this.f18542c, this.d);
                return;
        }
    }
}
