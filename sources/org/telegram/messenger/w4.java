package org.telegram.messenger;
public final class w4 implements Runnable {
    public final int f21731a;
    public final ImageLoader f21732b;
    public final String f21733c;

    public w4(ImageLoader imageLoader, String str, int i10) {
        this.f21731a = i10;
        this.f21732b = imageLoader;
        this.f21733c = str;
    }

    @Override
    public final void run() {
        switch (this.f21731a) {
            case 0:
                this.f21732b.lambda$artworkLoadError$10(this.f21733c);
                return;
            case 1:
                this.f21732b.lambda$cancelForceLoadingForImageReceiver$6(this.f21733c);
                return;
            case 2:
                this.f21732b.lambda$preloadArtwork$8(this.f21733c);
                return;
            case 3:
                this.f21732b.lambda$httpFileLoadError$9(this.f21733c);
                return;
            default:
                this.f21732b.lambda$fileDidFailedLoad$12(this.f21733c);
                return;
        }
    }
}
