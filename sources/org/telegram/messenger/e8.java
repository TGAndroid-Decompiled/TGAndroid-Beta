package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f20102a;
    public final MediaDataController f20103b;
    public final boolean f20104c;

    public e8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f20102a = i10;
        this.f20103b = mediaDataController;
        this.f20104c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20102a) {
            case 0:
                this.f20103b.lambda$loadFeaturedStickers$55(this.f20104c);
                return;
            default:
                this.f20103b.lambda$processLoadedFeaturedStickers$59(this.f20104c);
                return;
        }
    }
}
