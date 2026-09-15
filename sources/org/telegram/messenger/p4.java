package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17014a;
    public final ImageLoader f17015b;
    public final String f17016c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17014a = i10;
        this.f17015b = imageLoader;
        this.f17016c = str;
    }

    @Override
    public final void run() {
        switch (this.f17014a) {
            case 0:
                this.f17015b.lambda$artworkLoadError$10(this.f17016c);
                return;
            case 1:
                this.f17015b.lambda$cancelForceLoadingForImageReceiver$6(this.f17016c);
                return;
            case 2:
                this.f17015b.lambda$preloadArtwork$8(this.f17016c);
                return;
            case 3:
                this.f17015b.lambda$httpFileLoadError$9(this.f17016c);
                return;
            default:
                this.f17015b.lambda$fileDidFailedLoad$12(this.f17016c);
                return;
        }
    }
}
