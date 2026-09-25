package org.telegram.messenger;
public final class s8 implements Runnable {
    public final int f17519a;
    public final MediaDataController f17520b;
    public final boolean f17521c;
    public final int d;

    public s8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17519a = i11;
        this.f17520b = mediaDataController;
        this.f17521c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17519a) {
            case 0:
                this.f17520b.lambda$loadRecents$49(this.f17521c, this.d);
                return;
            case 1:
                this.f17520b.lambda$processLoadedFeaturedStickers$62(this.f17521c, this.d);
                return;
            default:
                this.f17520b.lambda$loadFeaturedStickers$56(this.f17521c, this.d);
                return;
        }
    }
}
