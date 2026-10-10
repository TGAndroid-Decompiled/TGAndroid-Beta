package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18506a;
    public final MediaDataController f18507b;
    public final boolean f18508c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18506a = i11;
        this.f18507b = mediaDataController;
        this.f18508c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18506a) {
            case 0:
                this.f18507b.lambda$loadRecents$49(this.f18508c, this.d);
                return;
            case 1:
                this.f18507b.lambda$processLoadedFeaturedStickers$62(this.f18508c, this.d);
                return;
            default:
                this.f18507b.lambda$loadFeaturedStickers$56(this.f18508c, this.d);
                return;
        }
    }
}
