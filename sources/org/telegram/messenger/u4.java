package org.telegram.messenger;
public final class u4 implements Runnable {
    public final int f16457a;
    public final ImageLoader f16458b;
    public final String f16459c;

    public u4(ImageLoader imageLoader, String str, int i10) {
        this.f16457a = i10;
        this.f16458b = imageLoader;
        this.f16459c = str;
    }

    @Override
    public final void run() {
        switch (this.f16457a) {
            case 0:
                this.f16458b.lambda$artworkLoadError$10(this.f16459c);
                return;
            case 1:
                this.f16458b.lambda$cancelForceLoadingForImageReceiver$6(this.f16459c);
                return;
            case 2:
                this.f16458b.lambda$preloadArtwork$8(this.f16459c);
                return;
            case 3:
                this.f16458b.lambda$httpFileLoadError$9(this.f16459c);
                return;
            default:
                this.f16458b.lambda$fileDidFailedLoad$12(this.f16459c);
                return;
        }
    }
}
