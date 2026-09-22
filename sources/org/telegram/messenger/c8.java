package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f15813a;
    public final MediaDataController f15814b;
    public final boolean f15815c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f15813a = i10;
        this.f15814b = mediaDataController;
        this.f15815c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15813a) {
            case 0:
                this.f15814b.lambda$loadFeaturedStickers$55(this.f15815c);
                return;
            default:
                this.f15814b.lambda$processLoadedFeaturedStickers$59(this.f15815c);
                return;
        }
    }
}
