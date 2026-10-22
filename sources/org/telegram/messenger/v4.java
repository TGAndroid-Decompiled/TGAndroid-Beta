package org.telegram.messenger;
public final class v4 implements Runnable {
    public final int f19733a;
    public final ImageLoader f19734b;
    public final String f19735c;

    public v4(ImageLoader imageLoader, String str, int i10) {
        this.f19733a = i10;
        this.f19734b = imageLoader;
        this.f19735c = str;
    }

    @Override
    public final void run() {
        switch (this.f19733a) {
            case 0:
                this.f19734b.lambda$artworkLoadError$10(this.f19735c);
                return;
            case 1:
                this.f19734b.lambda$cancelForceLoadingForImageReceiver$6(this.f19735c);
                return;
            case 2:
                this.f19734b.lambda$preloadArtwork$8(this.f19735c);
                return;
            case 3:
                this.f19734b.lambda$httpFileLoadError$9(this.f19735c);
                return;
            default:
                this.f19734b.lambda$fileDidFailedLoad$12(this.f19735c);
                return;
        }
    }
}
