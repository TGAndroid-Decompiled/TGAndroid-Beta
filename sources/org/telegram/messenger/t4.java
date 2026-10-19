package org.telegram.messenger;
public final class t4 implements Runnable {
    public final int f19553a;
    public final ImageLoader f19554b;
    public final String f19555c;

    public t4(ImageLoader imageLoader, String str, int i10) {
        this.f19553a = i10;
        this.f19554b = imageLoader;
        this.f19555c = str;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                this.f19554b.lambda$artworkLoadError$10(this.f19555c);
                return;
            case 1:
                this.f19554b.lambda$cancelForceLoadingForImageReceiver$6(this.f19555c);
                return;
            case 2:
                this.f19554b.lambda$preloadArtwork$8(this.f19555c);
                return;
            case 3:
                this.f19554b.lambda$httpFileLoadError$9(this.f19555c);
                return;
            default:
                this.f19554b.lambda$fileDidFailedLoad$12(this.f19555c);
                return;
        }
    }
}
