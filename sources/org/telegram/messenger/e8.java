package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f18333a;
    public final MediaDataController f18334b;
    public final boolean f18335c;

    public e8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18333a = i10;
        this.f18334b = mediaDataController;
        this.f18335c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18333a) {
            case 0:
                this.f18334b.lambda$loadFeaturedStickers$55(this.f18335c);
                return;
            default:
                this.f18334b.lambda$processLoadedFeaturedStickers$59(this.f18335c);
                return;
        }
    }
}
