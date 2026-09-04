package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f17315a;
    public final MediaDataController f17316b;
    public final boolean f17317c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17315a = i10;
        this.f17316b = mediaDataController;
        this.f17317c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17315a) {
            case 0:
                this.f17316b.lambda$loadFeaturedStickers$55(this.f17317c);
                return;
            default:
                this.f17316b.lambda$processLoadedFeaturedStickers$59(this.f17317c);
                return;
        }
    }
}
