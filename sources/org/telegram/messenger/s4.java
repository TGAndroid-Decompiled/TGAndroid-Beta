package org.telegram.messenger;
public final class s4 implements Runnable {
    public final int f19467a;
    public final ImageLoader f19468b;
    public final String f19469c;

    public s4(ImageLoader imageLoader, String str, int i10) {
        this.f19467a = i10;
        this.f19468b = imageLoader;
        this.f19469c = str;
    }

    @Override
    public final void run() {
        switch (this.f19467a) {
            case 0:
                this.f19468b.lambda$artworkLoadError$10(this.f19469c);
                return;
            case 1:
                this.f19468b.lambda$cancelForceLoadingForImageReceiver$6(this.f19469c);
                return;
            case 2:
                this.f19468b.lambda$preloadArtwork$8(this.f19469c);
                return;
            case 3:
                this.f19468b.lambda$httpFileLoadError$9(this.f19469c);
                return;
            default:
                this.f19468b.lambda$fileDidFailedLoad$12(this.f19469c);
                return;
        }
    }
}
