package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f15512a;
    public final MediaDataController f15513b;
    public final boolean f15514c;

    public j8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f15512a = i10;
        this.f15513b = mediaDataController;
        this.f15514c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15512a) {
            case 0:
                this.f15513b.lambda$loadFeaturedStickers$55(this.f15514c);
                return;
            default:
                this.f15513b.lambda$processLoadedFeaturedStickers$59(this.f15514c);
                return;
        }
    }
}
