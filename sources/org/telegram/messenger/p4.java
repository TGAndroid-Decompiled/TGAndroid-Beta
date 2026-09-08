package org.telegram.messenger;
public final class p4 implements Runnable {
    public final int f18679a;
    public final ImageLoader f18680b;
    public final String f18681c;

    public p4(ImageLoader imageLoader, String str, int i10) {
        this.f18679a = i10;
        this.f18680b = imageLoader;
        this.f18681c = str;
    }

    @Override
    public final void run() {
        switch (this.f18679a) {
            case 0:
                this.f18680b.lambda$artworkLoadError$10(this.f18681c);
                return;
            case 1:
                this.f18680b.lambda$cancelForceLoadingForImageReceiver$6(this.f18681c);
                return;
            case 2:
                this.f18680b.lambda$preloadArtwork$8(this.f18681c);
                return;
            case 3:
                this.f18680b.lambda$httpFileLoadError$9(this.f18681c);
                return;
            default:
                this.f18680b.lambda$fileDidFailedLoad$12(this.f18681c);
                return;
        }
    }
}
