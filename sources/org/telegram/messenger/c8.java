package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f18031a;
    public final MediaDataController f18032b;
    public final boolean f18033c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18031a = i10;
        this.f18032b = mediaDataController;
        this.f18033c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18031a) {
            case 0:
                this.f18032b.lambda$loadFeaturedStickers$55(this.f18033c);
                return;
            default:
                this.f18032b.lambda$processLoadedFeaturedStickers$59(this.f18033c);
                return;
        }
    }
}
