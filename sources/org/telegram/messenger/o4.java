package org.telegram.messenger;
public final class o4 implements Runnable {
    public final int f18595a;
    public final ImageLoader f18596b;
    public final String f18597c;

    public o4(ImageLoader imageLoader, String str, int i10) {
        this.f18595a = i10;
        this.f18596b = imageLoader;
        this.f18597c = str;
    }

    @Override
    public final void run() {
        switch (this.f18595a) {
            case 0:
                this.f18596b.lambda$artworkLoadError$10(this.f18597c);
                return;
            case 1:
                this.f18596b.lambda$cancelForceLoadingForImageReceiver$6(this.f18597c);
                return;
            case 2:
                this.f18596b.lambda$preloadArtwork$8(this.f18597c);
                return;
            case 3:
                this.f18596b.lambda$httpFileLoadError$9(this.f18597c);
                return;
            default:
                this.f18596b.lambda$fileDidFailedLoad$12(this.f18597c);
                return;
        }
    }
}
