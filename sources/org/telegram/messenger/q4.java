package org.telegram.messenger;
public final class q4 implements Runnable {
    public final int f18908a;
    public final ImageLoader f18909b;
    public final String f18910c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f18908a = i10;
        this.f18909b = imageLoader;
        this.f18910c = str;
    }

    @Override
    public final void run() {
        switch (this.f18908a) {
            case 0:
                this.f18909b.lambda$artworkLoadError$10(this.f18910c);
                return;
            case 1:
                this.f18909b.lambda$cancelForceLoadingForImageReceiver$6(this.f18910c);
                return;
            case 2:
                this.f18909b.lambda$preloadArtwork$8(this.f18910c);
                return;
            case 3:
                this.f18909b.lambda$httpFileLoadError$9(this.f18910c);
                return;
            default:
                this.f18909b.lambda$fileDidFailedLoad$12(this.f18910c);
                return;
        }
    }
}
