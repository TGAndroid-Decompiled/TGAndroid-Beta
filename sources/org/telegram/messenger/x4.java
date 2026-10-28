package org.telegram.messenger;
public final class x4 implements Runnable {
    public final int f21811a;
    public final ImageLoader f21812b;
    public final String f21813c;

    public x4(ImageLoader imageLoader, String str, int i10) {
        this.f21811a = i10;
        this.f21812b = imageLoader;
        this.f21813c = str;
    }

    @Override
    public final void run() {
        switch (this.f21811a) {
            case 0:
                this.f21812b.lambda$artworkLoadError$10(this.f21813c);
                return;
            case 1:
                this.f21812b.lambda$cancelForceLoadingForImageReceiver$6(this.f21813c);
                return;
            case 2:
                this.f21812b.lambda$preloadArtwork$8(this.f21813c);
                return;
            case 3:
                this.f21812b.lambda$httpFileLoadError$9(this.f21813c);
                return;
            default:
                this.f21812b.lambda$fileDidFailedLoad$12(this.f21813c);
                return;
        }
    }
}
