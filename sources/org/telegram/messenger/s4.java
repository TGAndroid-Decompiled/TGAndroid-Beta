package org.telegram.messenger;
public final class s4 implements Runnable {
    public final int f19468a;
    public final ImageLoader f19469b;
    public final String f19470c;

    public s4(ImageLoader imageLoader, String str, int i10) {
        this.f19468a = i10;
        this.f19469b = imageLoader;
        this.f19470c = str;
    }

    @Override
    public final void run() {
        switch (this.f19468a) {
            case 0:
                this.f19469b.lambda$artworkLoadError$10(this.f19470c);
                return;
            case 1:
                this.f19469b.lambda$cancelForceLoadingForImageReceiver$6(this.f19470c);
                return;
            case 2:
                this.f19469b.lambda$preloadArtwork$8(this.f19470c);
                return;
            case 3:
                this.f19469b.lambda$httpFileLoadError$9(this.f19470c);
                return;
            default:
                this.f19469b.lambda$fileDidFailedLoad$12(this.f19470c);
                return;
        }
    }
}
