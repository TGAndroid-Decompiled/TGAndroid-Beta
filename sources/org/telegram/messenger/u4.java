package org.telegram.messenger;
public final class u4 implements Runnable {
    public final int f19725a;
    public final ImageLoader f19726b;
    public final String f19727c;

    public u4(ImageLoader imageLoader, String str, int i10) {
        this.f19725a = i10;
        this.f19726b = imageLoader;
        this.f19727c = str;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                this.f19726b.lambda$artworkLoadError$10(this.f19727c);
                return;
            case 1:
                this.f19726b.lambda$cancelForceLoadingForImageReceiver$6(this.f19727c);
                return;
            case 2:
                this.f19726b.lambda$preloadArtwork$8(this.f19727c);
                return;
            case 3:
                this.f19726b.lambda$httpFileLoadError$9(this.f19727c);
                return;
            default:
                this.f19726b.lambda$fileDidFailedLoad$12(this.f19727c);
                return;
        }
    }
}
