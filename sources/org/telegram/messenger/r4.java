package org.telegram.messenger;
public final class r4 implements Runnable {
    public final int f19832a;
    public final ImageLoader f19833b;
    public final String f19834c;

    public r4(ImageLoader imageLoader, String str, int i10) {
        this.f19832a = i10;
        this.f19833b = imageLoader;
        this.f19834c = str;
    }

    @Override
    public final void run() {
        switch (this.f19832a) {
            case 0:
                this.f19833b.lambda$artworkLoadError$10(this.f19834c);
                return;
            case 1:
                this.f19833b.lambda$cancelForceLoadingForImageReceiver$6(this.f19834c);
                return;
            case 2:
                this.f19833b.lambda$preloadArtwork$8(this.f19834c);
                return;
            case 3:
                this.f19833b.lambda$httpFileLoadError$9(this.f19834c);
                return;
            default:
                this.f19833b.lambda$fileDidFailedLoad$12(this.f19834c);
                return;
        }
    }
}
