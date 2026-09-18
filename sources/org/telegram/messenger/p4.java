package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17023a;
    public final ImageLoader f17024b;
    public final String f17025c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17023a = i10;
        this.f17024b = imageLoader;
        this.f17025c = str;
    }

    @Override
    public final void run() {
        switch (this.f17023a) {
            case 0:
                this.f17024b.lambda$artworkLoadError$10(this.f17025c);
                return;
            case 1:
                this.f17024b.lambda$cancelForceLoadingForImageReceiver$6(this.f17025c);
                return;
            case 2:
                this.f17024b.lambda$preloadArtwork$8(this.f17025c);
                return;
            case 3:
                this.f17024b.lambda$httpFileLoadError$9(this.f17025c);
                return;
            default:
                this.f17024b.lambda$fileDidFailedLoad$12(this.f17025c);
                return;
        }
    }
}
