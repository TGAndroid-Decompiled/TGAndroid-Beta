package org.telegram.messenger;
public final class u8 implements Runnable {
    public final int f18551a;
    public final MediaDataController f18552b;
    public final boolean f18553c;
    public final int d;

    public u8(MediaDataController mediaDataController, boolean z4, int i10, int i11) {
        this.f18551a = i11;
        this.f18552b = mediaDataController;
        this.f18553c = z4;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18551a) {
            case 0:
                this.f18552b.lambda$loadRecents$49(this.f18553c, this.d);
                return;
            case 1:
                this.f18552b.lambda$processLoadedFeaturedStickers$62(this.f18553c, this.d);
                return;
            default:
                this.f18552b.lambda$loadFeaturedStickers$56(this.f18553c, this.d);
                return;
        }
    }
}
