package org.telegram.messenger;
public final class u4 implements Runnable {
    public final int f19660a;
    public final ImageLoader f19661b;
    public final String f19662c;

    public u4(ImageLoader imageLoader, String str, int i10) {
        this.f19660a = i10;
        this.f19661b = imageLoader;
        this.f19662c = str;
    }

    @Override
    public final void run() {
        switch (this.f19660a) {
            case 0:
                this.f19661b.lambda$artworkLoadError$10(this.f19662c);
                return;
            case 1:
                this.f19661b.lambda$cancelForceLoadingForImageReceiver$6(this.f19662c);
                return;
            case 2:
                this.f19661b.lambda$preloadArtwork$8(this.f19662c);
                return;
            case 3:
                this.f19661b.lambda$httpFileLoadError$9(this.f19662c);
                return;
            default:
                this.f19661b.lambda$fileDidFailedLoad$12(this.f19662c);
                return;
        }
    }
}
