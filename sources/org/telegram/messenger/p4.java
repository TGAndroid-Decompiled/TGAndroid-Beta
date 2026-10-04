package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f18846a;
    public final ImageLoader f18847b;
    public final String f18848c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f18846a = i10;
        this.f18847b = imageLoader;
        this.f18848c = str;
    }

    @Override
    public final void run() {
        switch (this.f18846a) {
            case 0:
                this.f18847b.lambda$artworkLoadError$10(this.f18848c);
                return;
            case 1:
                this.f18847b.lambda$cancelForceLoadingForImageReceiver$6(this.f18848c);
                return;
            case 2:
                this.f18847b.lambda$preloadArtwork$8(this.f18848c);
                return;
            case 3:
                this.f18847b.lambda$httpFileLoadError$9(this.f18848c);
                return;
            default:
                this.f18847b.lambda$fileDidFailedLoad$12(this.f18848c);
                return;
        }
    }
}
