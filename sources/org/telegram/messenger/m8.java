package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18944a;
    public final MediaDataController f18945b;
    public final boolean f18946c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18944a = i11;
        this.f18945b = mediaDataController;
        this.f18946c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18944a) {
            case 0:
                this.f18945b.lambda$loadRecents$49(this.f18946c, this.d);
                return;
            case 1:
                this.f18945b.lambda$processLoadedFeaturedStickers$62(this.f18946c, this.d);
                return;
            default:
                this.f18945b.lambda$loadFeaturedStickers$56(this.f18946c, this.d);
                return;
        }
    }
}
