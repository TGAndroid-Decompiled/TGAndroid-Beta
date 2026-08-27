package org.telegram.messenger;

public final class q4 implements Runnable {

    public final int f21317a;

    public final ImageLoader f21318b;

    public final String f21319c;

    public q4(ImageLoader imageLoader, String str, int i10) {
        this.f21317a = i10;
        this.f21318b = imageLoader;
        this.f21319c = str;
    }

    @Override
    public final void run() {
        switch (this.f21317a) {
            case 0:
                this.f21318b.lambda$artworkLoadError$10(this.f21319c);
                break;
            case 1:
                this.f21318b.lambda$cancelForceLoadingForImageReceiver$6(this.f21319c);
                break;
            case 2:
                this.f21318b.lambda$preloadArtwork$8(this.f21319c);
                break;
            case 3:
                this.f21318b.lambda$httpFileLoadError$9(this.f21319c);
                break;
            default:
                this.f21318b.lambda$fileDidFailedLoad$12(this.f21319c);
                break;
        }
    }
}
