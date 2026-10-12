package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f17251a;
    public final MediaDataController f17252b;
    public final boolean f17253c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17251a = i10;
        this.f17252b = mediaDataController;
        this.f17253c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17251a) {
            case 0:
                this.f17252b.lambda$loadFeaturedStickers$55(this.f17253c);
                return;
            default:
                this.f17252b.lambda$processLoadedFeaturedStickers$59(this.f17253c);
                return;
        }
    }
}
