package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17253a;
    public final ImageLoader f17254b;
    public final String f17255c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17253a = i10;
        this.f17254b = imageLoader;
        this.f17255c = str;
    }

    @Override
    public final void run() {
        switch (this.f17253a) {
            case 0:
                this.f17254b.lambda$artworkLoadError$10(this.f17255c);
                return;
            case 1:
                this.f17254b.lambda$cancelForceLoadingForImageReceiver$6(this.f17255c);
                return;
            case 2:
                this.f17254b.lambda$preloadArtwork$8(this.f17255c);
                return;
            case 3:
                this.f17254b.lambda$httpFileLoadError$9(this.f17255c);
                return;
            default:
                this.f17254b.lambda$fileDidFailedLoad$12(this.f17255c);
                return;
        }
    }
}
