package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18637a;
    public final MediaDataController f18638b;
    public final boolean f18639c;

    public f8(MediaDataController mediaDataController, boolean z4, int i10) {
        this.f18637a = i10;
        this.f18638b = mediaDataController;
        this.f18639c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18637a) {
            case 0:
                this.f18638b.lambda$loadFeaturedStickers$55(this.f18639c);
                return;
            default:
                this.f18638b.lambda$processLoadedFeaturedStickers$59(this.f18639c);
                return;
        }
    }
}
