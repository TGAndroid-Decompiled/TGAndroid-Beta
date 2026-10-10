package org.telegram.messenger;
public final class q4 implements Runnable {
    public final int f18903a;
    public final ImageLoader f18904b;
    public final String f18905c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f18903a = i10;
        this.f18904b = imageLoader;
        this.f18905c = str;
    }

    @Override
    public final void run() {
        switch (this.f18903a) {
            case 0:
                this.f18904b.lambda$artworkLoadError$10(this.f18905c);
                return;
            case 1:
                this.f18904b.lambda$cancelForceLoadingForImageReceiver$6(this.f18905c);
                return;
            case 2:
                this.f18904b.lambda$preloadArtwork$8(this.f18905c);
                return;
            case 3:
                this.f18904b.lambda$httpFileLoadError$9(this.f18905c);
                return;
            default:
                this.f18904b.lambda$fileDidFailedLoad$12(this.f18905c);
                return;
        }
    }
}
