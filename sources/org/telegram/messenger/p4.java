package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f18652a;
    public final ImageLoader f18653b;
    public final String f18654c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f18652a = i10;
        this.f18653b = imageLoader;
        this.f18654c = str;
    }

    @Override
    public final void run() {
        switch (this.f18652a) {
            case 0:
                this.f18653b.lambda$artworkLoadError$10(this.f18654c);
                return;
            case 1:
                this.f18653b.lambda$cancelForceLoadingForImageReceiver$6(this.f18654c);
                return;
            case 2:
                this.f18653b.lambda$preloadArtwork$8(this.f18654c);
                return;
            case 3:
                this.f18653b.lambda$httpFileLoadError$9(this.f18654c);
                return;
            default:
                this.f18653b.lambda$fileDidFailedLoad$12(this.f18654c);
                return;
        }
    }
}
