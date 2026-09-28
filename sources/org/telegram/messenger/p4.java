package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17260a;
    public final ImageLoader f17261b;
    public final String f17262c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17260a = i10;
        this.f17261b = imageLoader;
        this.f17262c = str;
    }

    @Override
    public final void run() {
        switch (this.f17260a) {
            case 0:
                this.f17261b.lambda$artworkLoadError$10(this.f17262c);
                return;
            case 1:
                this.f17261b.lambda$cancelForceLoadingForImageReceiver$6(this.f17262c);
                return;
            case 2:
                this.f17261b.lambda$preloadArtwork$8(this.f17262c);
                return;
            case 3:
                this.f17261b.lambda$httpFileLoadError$9(this.f17262c);
                return;
            default:
                this.f17261b.lambda$fileDidFailedLoad$12(this.f17262c);
                return;
        }
    }
}
