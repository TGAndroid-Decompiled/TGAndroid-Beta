package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17006a;
    public final ImageLoader f17007b;
    public final String f17008c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17006a = i10;
        this.f17007b = imageLoader;
        this.f17008c = str;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                this.f17007b.lambda$artworkLoadError$10(this.f17008c);
                return;
            case 1:
                this.f17007b.lambda$cancelForceLoadingForImageReceiver$6(this.f17008c);
                return;
            case 2:
                this.f17007b.lambda$preloadArtwork$8(this.f17008c);
                return;
            case 3:
                this.f17007b.lambda$httpFileLoadError$9(this.f17008c);
                return;
            default:
                this.f17007b.lambda$fileDidFailedLoad$12(this.f17008c);
                return;
        }
    }
}
