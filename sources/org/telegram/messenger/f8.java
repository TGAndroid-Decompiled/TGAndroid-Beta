package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18336a;
    public final MediaDataController f18337b;
    public final boolean f18338c;

    public f8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18336a = i10;
        this.f18337b = mediaDataController;
        this.f18338c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18336a) {
            case 0:
                this.f18337b.lambda$loadFeaturedStickers$55(this.f18338c);
                return;
            default:
                this.f18337b.lambda$processLoadedFeaturedStickers$59(this.f18338c);
                return;
        }
    }
}
