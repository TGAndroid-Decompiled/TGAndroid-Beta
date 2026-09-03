package org.telegram.messenger;
public final class r4 implements Runnable {
    public final int f18242a;
    public final ImageLoader f18243b;
    public final String f18244c;

    public r4(ImageLoader imageLoader, String str, int i10) {
        this.f18242a = i10;
        this.f18243b = imageLoader;
        this.f18244c = str;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                this.f18243b.lambda$artworkLoadError$10(this.f18244c);
                return;
            case 1:
                this.f18243b.lambda$cancelForceLoadingForImageReceiver$6(this.f18244c);
                return;
            case 2:
                this.f18243b.lambda$preloadArtwork$8(this.f18244c);
                return;
            case 3:
                this.f18243b.lambda$httpFileLoadError$9(this.f18244c);
                return;
            default:
                this.f18243b.lambda$fileDidFailedLoad$12(this.f18244c);
                return;
        }
    }
}
