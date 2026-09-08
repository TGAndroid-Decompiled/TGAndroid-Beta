package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f17342a;
    public final MediaDataController f17343b;
    public final boolean f17344c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17342a = i10;
        this.f17343b = mediaDataController;
        this.f17344c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17342a) {
            case 0:
                this.f17343b.lambda$loadFeaturedStickers$55(this.f17344c);
                return;
            default:
                this.f17343b.lambda$processLoadedFeaturedStickers$59(this.f17344c);
                return;
        }
    }
}
