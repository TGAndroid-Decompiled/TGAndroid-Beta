package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f18850a;
    public final ImageLoader f18851b;
    public final String f18852c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f18850a = i10;
        this.f18851b = imageLoader;
        this.f18852c = str;
    }

    @Override
    public final void run() {
        switch (this.f18850a) {
            case 0:
                this.f18851b.lambda$artworkLoadError$10(this.f18852c);
                return;
            case 1:
                this.f18851b.lambda$cancelForceLoadingForImageReceiver$6(this.f18852c);
                return;
            case 2:
                this.f18851b.lambda$preloadArtwork$8(this.f18852c);
                return;
            case 3:
                this.f18851b.lambda$httpFileLoadError$9(this.f18852c);
                return;
            default:
                this.f18851b.lambda$fileDidFailedLoad$12(this.f18852c);
                return;
        }
    }
}
