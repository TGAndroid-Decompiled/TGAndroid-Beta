package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18401a;
    public final MediaDataController f18402b;
    public final boolean f18403c;

    public f8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18401a = i10;
        this.f18402b = mediaDataController;
        this.f18403c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18401a) {
            case 0:
                this.f18402b.lambda$loadFeaturedStickers$55(this.f18403c);
                return;
            default:
                this.f18402b.lambda$processLoadedFeaturedStickers$59(this.f18403c);
                return;
        }
    }
}
