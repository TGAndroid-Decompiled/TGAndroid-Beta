package org.telegram.messenger;

public final class r8 implements Runnable {

    public final int f21415a;

    public final MediaDataController f21416b;

    public final boolean f21417c;
    public final int d;

    public r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f21415a = i11;
        this.f21416b = mediaDataController;
        this.f21417c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21415a) {
            case 0:
                this.f21416b.lambda$loadRecents$49(this.f21417c, this.d);
                break;
            case 1:
                this.f21416b.lambda$processLoadedFeaturedStickers$62(this.f21417c, this.d);
                break;
            default:
                this.f21416b.lambda$loadFeaturedStickers$56(this.f21417c, this.d);
                break;
        }
    }
}
