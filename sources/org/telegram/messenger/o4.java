package org.telegram.messenger;
public final class o4 implements Runnable {
    public final int f21110a;
    public final ImageLoader f21111b;
    public final String f21112c;

    public o4(ImageLoader imageLoader, String str, int i9) {
        this.f21110a = i9;
        this.f21111b = imageLoader;
        this.f21112c = str;
    }

    @Override
    public final void run() {
        switch (this.f21110a) {
            case 0:
                this.f21111b.lambda$artworkLoadError$10(this.f21112c);
                return;
            case 1:
                this.f21111b.lambda$cancelForceLoadingForImageReceiver$6(this.f21112c);
                return;
            case 2:
                this.f21111b.lambda$preloadArtwork$8(this.f21112c);
                return;
            case 3:
                this.f21111b.lambda$httpFileLoadError$9(this.f21112c);
                return;
            default:
                this.f21111b.lambda$fileDidFailedLoad$12(this.f21112c);
                return;
        }
    }
}
