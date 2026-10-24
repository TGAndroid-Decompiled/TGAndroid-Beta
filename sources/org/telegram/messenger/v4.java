package org.telegram.messenger;
public final class v4 implements Runnable {
    public final int f19796a;
    public final ImageLoader f19797b;
    public final String f19798c;

    public v4(ImageLoader imageLoader, String str, int i10) {
        this.f19796a = i10;
        this.f19797b = imageLoader;
        this.f19798c = str;
    }

    @Override
    public final void run() {
        switch (this.f19796a) {
            case 0:
                this.f19797b.lambda$artworkLoadError$10(this.f19798c);
                return;
            case 1:
                this.f19797b.lambda$cancelForceLoadingForImageReceiver$6(this.f19798c);
                return;
            case 2:
                this.f19797b.lambda$preloadArtwork$8(this.f19798c);
                return;
            case 3:
                this.f19797b.lambda$httpFileLoadError$9(this.f19798c);
                return;
            default:
                this.f19797b.lambda$fileDidFailedLoad$12(this.f19798c);
                return;
        }
    }
}
