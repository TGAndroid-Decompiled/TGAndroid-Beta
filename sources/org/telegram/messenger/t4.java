package org.telegram.messenger;
public final class t4 implements Runnable {
    public final int f18952a;
    public final ImageLoader f18953b;
    public final String f18954c;

    public t4(ImageLoader imageLoader, String str, int i10) {
        this.f18952a = i10;
        this.f18953b = imageLoader;
        this.f18954c = str;
    }

    @Override
    public final void run() {
        switch (this.f18952a) {
            case 0:
                this.f18953b.lambda$artworkLoadError$10(this.f18954c);
                return;
            case 1:
                this.f18953b.lambda$cancelForceLoadingForImageReceiver$6(this.f18954c);
                return;
            case 2:
                this.f18953b.lambda$preloadArtwork$8(this.f18954c);
                return;
            case 3:
                this.f18953b.lambda$httpFileLoadError$9(this.f18954c);
                return;
            default:
                this.f18953b.lambda$fileDidFailedLoad$12(this.f18954c);
                return;
        }
    }
}
