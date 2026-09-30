package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17261a;
    public final ImageLoader f17262b;
    public final String f17263c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17261a = i10;
        this.f17262b = imageLoader;
        this.f17263c = str;
    }

    @Override
    public final void run() {
        switch (this.f17261a) {
            case 0:
                this.f17262b.lambda$artworkLoadError$10(this.f17263c);
                return;
            case 1:
                this.f17262b.lambda$cancelForceLoadingForImageReceiver$6(this.f17263c);
                return;
            case 2:
                this.f17262b.lambda$preloadArtwork$8(this.f17263c);
                return;
            case 3:
                this.f17262b.lambda$httpFileLoadError$9(this.f17263c);
                return;
            default:
                this.f17262b.lambda$fileDidFailedLoad$12(this.f17263c);
                return;
        }
    }
}
