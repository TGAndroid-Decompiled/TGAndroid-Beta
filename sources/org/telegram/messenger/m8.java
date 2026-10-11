package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18504a;
    public final MediaDataController f18505b;
    public final boolean f18506c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18504a = i11;
        this.f18505b = mediaDataController;
        this.f18506c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18504a) {
            case 0:
                this.f18505b.lambda$loadRecents$49(this.f18506c, this.d);
                return;
            case 1:
                this.f18505b.lambda$processLoadedFeaturedStickers$62(this.f18506c, this.d);
                return;
            default:
                this.f18505b.lambda$loadFeaturedStickers$56(this.f18506c, this.d);
                return;
        }
    }
}
