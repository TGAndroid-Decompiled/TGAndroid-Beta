package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17242a;
    public final ImageLoader f17243b;
    public final String f17244c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17242a = i10;
        this.f17243b = imageLoader;
        this.f17244c = str;
    }

    @Override
    public final void run() {
        switch (this.f17242a) {
            case 0:
                this.f17243b.lambda$artworkLoadError$10(this.f17244c);
                return;
            case 1:
                this.f17243b.lambda$cancelForceLoadingForImageReceiver$6(this.f17244c);
                return;
            case 2:
                this.f17243b.lambda$preloadArtwork$8(this.f17244c);
                return;
            case 3:
                this.f17243b.lambda$httpFileLoadError$9(this.f17244c);
                return;
            default:
                this.f17243b.lambda$fileDidFailedLoad$12(this.f17244c);
                return;
        }
    }
}
