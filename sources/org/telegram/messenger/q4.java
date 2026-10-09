package org.telegram.messenger;
public final class q4 implements Runnable {
    public final int f18899a;
    public final ImageLoader f18900b;
    public final String f18901c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f18899a = i10;
        this.f18900b = imageLoader;
        this.f18901c = str;
    }

    @Override
    public final void run() {
        switch (this.f18899a) {
            case 0:
                this.f18900b.lambda$artworkLoadError$10(this.f18901c);
                return;
            case 1:
                this.f18900b.lambda$cancelForceLoadingForImageReceiver$6(this.f18901c);
                return;
            case 2:
                this.f18900b.lambda$preloadArtwork$8(this.f18901c);
                return;
            case 3:
                this.f18900b.lambda$httpFileLoadError$9(this.f18901c);
                return;
            default:
                this.f18900b.lambda$fileDidFailedLoad$12(this.f18901c);
                return;
        }
    }
}
