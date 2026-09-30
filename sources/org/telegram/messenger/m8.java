package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f17015a;
    public final MediaDataController f17016b;
    public final boolean f17017c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17015a = i11;
        this.f17016b = mediaDataController;
        this.f17017c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17015a) {
            case 0:
                this.f17016b.lambda$loadRecents$49(this.f17017c, this.d);
                return;
            case 1:
                this.f17016b.lambda$processLoadedFeaturedStickers$62(this.f17017c, this.d);
                return;
            default:
                this.f17016b.lambda$loadFeaturedStickers$56(this.f17017c, this.d);
                return;
        }
    }
}
