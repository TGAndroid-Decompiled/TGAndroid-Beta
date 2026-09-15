package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f15817a;
    public final MediaDataController f15818b;
    public final boolean f15819c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f15817a = i10;
        this.f15818b = mediaDataController;
        this.f15819c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15817a) {
            case 0:
                this.f15818b.lambda$loadFeaturedStickers$55(this.f15819c);
                return;
            default:
                this.f15818b.lambda$processLoadedFeaturedStickers$59(this.f15819c);
                return;
        }
    }
}
