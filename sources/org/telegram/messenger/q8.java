package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f18820a;
    public final MediaDataController f18821b;
    public final boolean f18822c;
    public final int d;

    public q8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18820a = i11;
        this.f18821b = mediaDataController;
        this.f18822c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18820a) {
            case 0:
                this.f18821b.lambda$loadRecents$49(this.f18822c, this.d);
                return;
            case 1:
                this.f18821b.lambda$processLoadedFeaturedStickers$62(this.f18822c, this.d);
                return;
            default:
                this.f18821b.lambda$loadFeaturedStickers$56(this.f18822c, this.d);
                return;
        }
    }
}
