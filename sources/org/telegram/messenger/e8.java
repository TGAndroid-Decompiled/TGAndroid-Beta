package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f18268a;
    public final MediaDataController f18269b;
    public final boolean f18270c;

    public e8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18268a = i10;
        this.f18269b = mediaDataController;
        this.f18270c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18268a) {
            case 0:
                this.f18269b.lambda$loadFeaturedStickers$55(this.f18270c);
                return;
            default:
                this.f18269b.lambda$processLoadedFeaturedStickers$59(this.f18270c);
                return;
        }
    }
}
