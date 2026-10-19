package org.telegram.messenger;
public final class s4 implements Runnable {
    public final int f19465a;
    public final ImageLoader f19466b;
    public final String f19467c;

    public s4(ImageLoader imageLoader, String str, int i10) {
        this.f19465a = i10;
        this.f19466b = imageLoader;
        this.f19467c = str;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                this.f19466b.lambda$artworkLoadError$10(this.f19467c);
                return;
            case 1:
                this.f19466b.lambda$cancelForceLoadingForImageReceiver$6(this.f19467c);
                return;
            case 2:
                this.f19466b.lambda$preloadArtwork$8(this.f19467c);
                return;
            case 3:
                this.f19466b.lambda$httpFileLoadError$9(this.f19467c);
                return;
            default:
                this.f19466b.lambda$fileDidFailedLoad$12(this.f19467c);
                return;
        }
    }
}
