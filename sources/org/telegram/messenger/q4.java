package org.telegram.messenger;
public final class q4 implements Runnable {
    public final int f18944a;
    public final ImageLoader f18945b;
    public final String f18946c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f18944a = i10;
        this.f18945b = imageLoader;
        this.f18946c = str;
    }

    @Override
    public final void run() {
        switch (this.f18944a) {
            case 0:
                this.f18945b.lambda$artworkLoadError$10(this.f18946c);
                return;
            case 1:
                this.f18945b.lambda$cancelForceLoadingForImageReceiver$6(this.f18946c);
                return;
            case 2:
                this.f18945b.lambda$preloadArtwork$8(this.f18946c);
                return;
            case 3:
                this.f18945b.lambda$httpFileLoadError$9(this.f18946c);
                return;
            default:
                this.f18945b.lambda$fileDidFailedLoad$12(this.f18946c);
                return;
        }
    }
}
