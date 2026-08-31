package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18635a;
    public final MediaDataController f18636b;
    public final boolean f18637c;

    public f8(MediaDataController mediaDataController, boolean z4, int i10) {
        this.f18635a = i10;
        this.f18636b = mediaDataController;
        this.f18637c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18635a) {
            case 0:
                this.f18636b.lambda$loadFeaturedStickers$55(this.f18637c);
                return;
            default:
                this.f18636b.lambda$processLoadedFeaturedStickers$59(this.f18637c);
                return;
        }
    }
}
