package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f18793a;
    public final MediaDataController f18794b;
    public final boolean f18795c;
    public final int d;

    public q8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18793a = i11;
        this.f18794b = mediaDataController;
        this.f18795c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18793a) {
            case 0:
                this.f18794b.lambda$loadRecents$49(this.f18795c, this.d);
                return;
            case 1:
                this.f18794b.lambda$processLoadedFeaturedStickers$62(this.f18795c, this.d);
                return;
            default:
                this.f18794b.lambda$loadFeaturedStickers$56(this.f18795c, this.d);
                return;
        }
    }
}
