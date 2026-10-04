package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18553a;
    public final MediaDataController f18554b;
    public final boolean f18555c;
    public final int d;

    public m8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f18553a = i11;
        this.f18554b = mediaDataController;
        this.f18555c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18553a) {
            case 0:
                this.f18554b.lambda$loadRecents$49(this.f18555c, this.d);
                return;
            case 1:
                this.f18554b.lambda$processLoadedFeaturedStickers$62(this.f18555c, this.d);
                return;
            default:
                this.f18554b.lambda$loadFeaturedStickers$56(this.f18555c, this.d);
                return;
        }
    }
}
