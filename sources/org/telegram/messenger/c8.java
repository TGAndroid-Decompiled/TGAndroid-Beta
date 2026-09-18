package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f15826a;
    public final MediaDataController f15827b;
    public final boolean f15828c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f15826a = i10;
        this.f15827b = mediaDataController;
        this.f15828c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15826a) {
            case 0:
                this.f15827b.lambda$loadFeaturedStickers$55(this.f15828c);
                return;
            default:
                this.f15827b.lambda$processLoadedFeaturedStickers$59(this.f15828c);
                return;
        }
    }
}
