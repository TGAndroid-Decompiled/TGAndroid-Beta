package org.telegram.messenger;
public final class q4 implements Runnable {
    public final int f21306a;
    public final ImageLoader f21307b;
    public final String f21308c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f21306a = i10;
        this.f21307b = imageLoader;
        this.f21308c = str;
    }

    @Override
    public final void run() {
        switch (this.f21306a) {
            case 0:
                this.f21307b.lambda$artworkLoadError$10(this.f21308c);
                return;
            case 1:
                this.f21307b.lambda$cancelForceLoadingForImageReceiver$6(this.f21308c);
                return;
            case 2:
                this.f21307b.lambda$preloadArtwork$8(this.f21308c);
                return;
            case 3:
                this.f21307b.lambda$httpFileLoadError$9(this.f21308c);
                return;
            default:
                this.f21307b.lambda$fileDidFailedLoad$12(this.f21308c);
                return;
        }
    }
}
