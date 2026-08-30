package org.telegram.messenger;
public final class u8 implements Runnable {
    public final int f18569a;
    public final MediaDataController f18570b;
    public final boolean f18571c;
    public final int d;

    public u8(MediaDataController mediaDataController, boolean z4, int i10, int i11) {
        this.f18569a = i11;
        this.f18570b = mediaDataController;
        this.f18571c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18569a) {
            case 0:
                this.f18570b.lambda$loadRecents$49(this.f18571c, this.d);
                return;
            case 1:
                this.f18570b.lambda$processLoadedFeaturedStickers$62(this.f18571c, this.d);
                return;
            default:
                this.f18570b.lambda$loadFeaturedStickers$56(this.f18571c, this.d);
                return;
        }
    }
}
