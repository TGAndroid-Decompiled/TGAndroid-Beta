package org.telegram.messenger;
public final class t4 implements Runnable {
    public final int f18951a;
    public final ImageLoader f18952b;
    public final String f18953c;

    public t4(ImageLoader imageLoader, String str, int i10) {
        this.f18951a = i10;
        this.f18952b = imageLoader;
        this.f18953c = str;
    }

    @Override
    public final void run() {
        switch (this.f18951a) {
            case 0:
                this.f18952b.lambda$artworkLoadError$10(this.f18953c);
                return;
            case 1:
                this.f18952b.lambda$cancelForceLoadingForImageReceiver$6(this.f18953c);
                return;
            case 2:
                this.f18952b.lambda$preloadArtwork$8(this.f18953c);
                return;
            case 3:
                this.f18952b.lambda$httpFileLoadError$9(this.f18953c);
                return;
            default:
                this.f18952b.lambda$fileDidFailedLoad$12(this.f18953c);
                return;
        }
    }
}
