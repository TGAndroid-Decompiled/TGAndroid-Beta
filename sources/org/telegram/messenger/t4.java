package org.telegram.messenger;
public final class t4 implements Runnable {
    public final int f18457a;
    public final ImageLoader f18458b;
    public final String f18459c;

    public t4(ImageLoader imageLoader, String str, int i10) {
        this.f18457a = i10;
        this.f18458b = imageLoader;
        this.f18459c = str;
    }

    @Override
    public final void run() {
        switch (this.f18457a) {
            case 0:
                this.f18458b.lambda$artworkLoadError$10(this.f18459c);
                return;
            case 1:
                this.f18458b.lambda$cancelForceLoadingForImageReceiver$6(this.f18459c);
                return;
            case 2:
                this.f18458b.lambda$preloadArtwork$8(this.f18459c);
                return;
            case 3:
                this.f18458b.lambda$httpFileLoadError$9(this.f18459c);
                return;
            default:
                this.f18458b.lambda$fileDidFailedLoad$12(this.f18459c);
                return;
        }
    }
}
