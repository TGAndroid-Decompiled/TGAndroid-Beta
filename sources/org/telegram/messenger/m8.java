package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18557a;
    public final MediaDataController f18558b;
    public final boolean f18559c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18557a = i11;
        this.f18558b = mediaDataController;
        this.f18559c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18557a) {
            case 0:
                this.f18558b.lambda$loadRecents$49(this.f18559c, this.d);
                return;
            case 1:
                this.f18558b.lambda$processLoadedFeaturedStickers$62(this.f18559c, this.d);
                return;
            default:
                this.f18558b.lambda$loadFeaturedStickers$56(this.f18559c, this.d);
                return;
        }
    }
}
