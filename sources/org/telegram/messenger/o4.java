package org.telegram.messenger;
public final class o4 implements Runnable {
    public final int f18568a;
    public final ImageLoader f18569b;
    public final String f18570c;

    public o4(ImageLoader imageLoader, String str, int i10) {
        this.f18568a = i10;
        this.f18569b = imageLoader;
        this.f18570c = str;
    }

    @Override
    public final void run() {
        switch (this.f18568a) {
            case 0:
                this.f18569b.lambda$artworkLoadError$10(this.f18570c);
                return;
            case 1:
                this.f18569b.lambda$cancelForceLoadingForImageReceiver$6(this.f18570c);
                return;
            case 2:
                this.f18569b.lambda$preloadArtwork$8(this.f18570c);
                return;
            case 3:
                this.f18569b.lambda$httpFileLoadError$9(this.f18570c);
                return;
            default:
                this.f18569b.lambda$fileDidFailedLoad$12(this.f18570c);
                return;
        }
    }
}
