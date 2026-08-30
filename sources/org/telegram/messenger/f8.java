package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17193a;
    public final MediaDataController f17194b;
    public final boolean f17195c;

    public f8(MediaDataController mediaDataController, boolean z4, int i10) {
        this.f17193a = i10;
        this.f17194b = mediaDataController;
        this.f17195c = z4;
    }

    @Override
    public final void run() {
        switch (this.f17193a) {
            case 0:
                this.f17194b.lambda$loadFeaturedStickers$55(this.f17195c);
                return;
            default:
                this.f17194b.lambda$processLoadedFeaturedStickers$59(this.f17195c);
                return;
        }
    }
}
