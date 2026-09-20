package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f17227a;
    public final ImageLoader f17228b;
    public final String f17229c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f17227a = i10;
        this.f17228b = imageLoader;
        this.f17229c = str;
    }

    @Override
    public final void run() {
        switch (this.f17227a) {
            case 0:
                this.f17228b.lambda$artworkLoadError$10(this.f17229c);
                return;
            case 1:
                this.f17228b.lambda$cancelForceLoadingForImageReceiver$6(this.f17229c);
                return;
            case 2:
                this.f17228b.lambda$preloadArtwork$8(this.f17229c);
                return;
            case 3:
                this.f17228b.lambda$httpFileLoadError$9(this.f17229c);
                return;
            default:
                this.f17228b.lambda$fileDidFailedLoad$12(this.f17229c);
                return;
        }
    }
}
