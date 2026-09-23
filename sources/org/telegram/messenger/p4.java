package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17003a;
    public final ImageLoader f17004b;
    public final String f17005c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17003a = i10;
        this.f17004b = imageLoader;
        this.f17005c = str;
    }

    @Override
    public final void run() {
        switch (this.f17003a) {
            case 0:
                this.f17004b.lambda$artworkLoadError$10(this.f17005c);
                return;
            case 1:
                this.f17004b.lambda$cancelForceLoadingForImageReceiver$6(this.f17005c);
                return;
            case 2:
                this.f17004b.lambda$preloadArtwork$8(this.f17005c);
                return;
            case 3:
                this.f17004b.lambda$httpFileLoadError$9(this.f17005c);
                return;
            default:
                this.f17004b.lambda$fileDidFailedLoad$12(this.f17005c);
                return;
        }
    }
}
