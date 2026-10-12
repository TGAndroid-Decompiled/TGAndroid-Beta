package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f17250a;
    public final MediaDataController f17251b;
    public final boolean f17252c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17250a = i10;
        this.f17251b = mediaDataController;
        this.f17252c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17250a) {
            case 0:
                this.f17251b.lambda$loadFeaturedStickers$55(this.f17252c);
                return;
            default:
                this.f17251b.lambda$processLoadedFeaturedStickers$59(this.f17252c);
                return;
        }
    }
}
