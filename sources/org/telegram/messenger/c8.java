package org.telegram.messenger;

public final class c8 implements Runnable {

    public final int f19892a;

    public final MediaDataController f19893b;

    public final boolean f19894c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19892a = i10;
        this.f19893b = mediaDataController;
        this.f19894c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19892a) {
            case 0:
                this.f19893b.lambda$loadFeaturedStickers$55(this.f19894c);
                break;
            default:
                this.f19893b.lambda$processLoadedFeaturedStickers$59(this.f19894c);
                break;
        }
    }
}
