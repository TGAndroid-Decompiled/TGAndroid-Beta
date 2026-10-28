package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f20230a;
    public final MediaDataController f20231b;
    public final boolean f20232c;

    public h8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f20230a = i10;
        this.f20231b = mediaDataController;
        this.f20232c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20230a) {
            case 0:
                this.f20231b.lambda$loadFeaturedStickers$55(this.f20232c);
                return;
            default:
                this.f20231b.lambda$processLoadedFeaturedStickers$59(this.f20232c);
                return;
        }
    }
}
