package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17173a;
    public final MediaDataController f17174b;
    public final boolean f17175c;

    public f8(MediaDataController mediaDataController, boolean z4, int i10) {
        this.f17173a = i10;
        this.f17174b = mediaDataController;
        this.f17175c = z4;
    }

    @Override
    public final void run() {
        switch (this.f17173a) {
            case 0:
                this.f17174b.lambda$loadFeaturedStickers$55(this.f17175c);
                return;
            default:
                this.f17174b.lambda$processLoadedFeaturedStickers$59(this.f17175c);
                return;
        }
    }
}
