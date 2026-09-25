package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17256a;
    public final ImageLoader f17257b;
    public final String f17258c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17256a = i10;
        this.f17257b = imageLoader;
        this.f17258c = str;
    }

    @Override
    public final void run() {
        switch (this.f17256a) {
            case 0:
                this.f17257b.lambda$artworkLoadError$10(this.f17258c);
                return;
            case 1:
                this.f17257b.lambda$cancelForceLoadingForImageReceiver$6(this.f17258c);
                return;
            case 2:
                this.f17257b.lambda$preloadArtwork$8(this.f17258c);
                return;
            case 3:
                this.f17257b.lambda$httpFileLoadError$9(this.f17258c);
                return;
            default:
                this.f17257b.lambda$fileDidFailedLoad$12(this.f17258c);
                return;
        }
    }
}
