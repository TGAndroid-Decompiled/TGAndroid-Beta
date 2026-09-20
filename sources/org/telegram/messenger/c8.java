package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16038a;
    public final MediaDataController f16039b;
    public final boolean f16040c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16038a = i10;
        this.f16039b = mediaDataController;
        this.f16040c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16038a) {
            case 0:
                this.f16039b.lambda$loadFeaturedStickers$55(this.f16040c);
                return;
            default:
                this.f16039b.lambda$processLoadedFeaturedStickers$59(this.f16040c);
                return;
        }
    }
}
