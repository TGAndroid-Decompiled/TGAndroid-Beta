package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17277a;
    public final ImageLoader f17278b;
    public final String f17279c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17277a = i10;
        this.f17278b = imageLoader;
        this.f17279c = str;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                this.f17278b.lambda$artworkLoadError$10(this.f17279c);
                return;
            case 1:
                this.f17278b.lambda$cancelForceLoadingForImageReceiver$6(this.f17279c);
                return;
            case 2:
                this.f17278b.lambda$preloadArtwork$8(this.f17279c);
                return;
            case 3:
                this.f17278b.lambda$httpFileLoadError$9(this.f17279c);
                return;
            default:
                this.f17278b.lambda$fileDidFailedLoad$12(this.f17279c);
                return;
        }
    }
}
