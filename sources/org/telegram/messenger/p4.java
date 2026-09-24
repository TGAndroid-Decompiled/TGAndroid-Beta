package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17241a;
    public final ImageLoader f17242b;
    public final String f17243c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17241a = i10;
        this.f17242b = imageLoader;
        this.f17243c = str;
    }

    @Override
    public final void run() {
        switch (this.f17241a) {
            case 0:
                this.f17242b.lambda$artworkLoadError$10(this.f17243c);
                return;
            case 1:
                this.f17242b.lambda$cancelForceLoadingForImageReceiver$6(this.f17243c);
                return;
            case 2:
                this.f17242b.lambda$preloadArtwork$8(this.f17243c);
                return;
            case 3:
                this.f17242b.lambda$httpFileLoadError$9(this.f17243c);
                return;
            default:
                this.f17242b.lambda$fileDidFailedLoad$12(this.f17243c);
                return;
        }
    }
}
