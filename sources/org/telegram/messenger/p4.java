package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17186a;
    public final ImageLoader f17187b;
    public final String f17188c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17186a = i10;
        this.f17187b = imageLoader;
        this.f17188c = str;
    }

    @Override
    public final void run() {
        switch (this.f17186a) {
            case 0:
                this.f17187b.lambda$artworkLoadError$10(this.f17188c);
                return;
            case 1:
                this.f17187b.lambda$cancelForceLoadingForImageReceiver$6(this.f17188c);
                return;
            case 2:
                this.f17187b.lambda$preloadArtwork$8(this.f17188c);
                return;
            case 3:
                this.f17187b.lambda$httpFileLoadError$9(this.f17188c);
                return;
            default:
                this.f17187b.lambda$fileDidFailedLoad$12(this.f17188c);
                return;
        }
    }
}
