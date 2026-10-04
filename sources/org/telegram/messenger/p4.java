package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f18845a;
    public final ImageLoader f18846b;
    public final String f18847c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f18845a = i10;
        this.f18846b = imageLoader;
        this.f18847c = str;
    }

    @Override
    public final void run() {
        switch (this.f18845a) {
            case 0:
                this.f18846b.lambda$artworkLoadError$10(this.f18847c);
                return;
            case 1:
                this.f18846b.lambda$cancelForceLoadingForImageReceiver$6(this.f18847c);
                return;
            case 2:
                this.f18846b.lambda$preloadArtwork$8(this.f18847c);
                return;
            case 3:
                this.f18846b.lambda$httpFileLoadError$9(this.f18847c);
                return;
            default:
                this.f18846b.lambda$fileDidFailedLoad$12(this.f18847c);
                return;
        }
    }
}
