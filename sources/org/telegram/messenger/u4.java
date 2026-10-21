package org.telegram.messenger;
public final class u4 implements Runnable {
    public final int f19637a;
    public final ImageLoader f19638b;
    public final String f19639c;

    public u4(ImageLoader imageLoader, String str, int i10) {
        this.f19637a = i10;
        this.f19638b = imageLoader;
        this.f19639c = str;
    }

    @Override
    public final void run() {
        switch (this.f19637a) {
            case 0:
                this.f19638b.lambda$artworkLoadError$10(this.f19639c);
                return;
            case 1:
                this.f19638b.lambda$cancelForceLoadingForImageReceiver$6(this.f19639c);
                return;
            case 2:
                this.f19638b.lambda$preloadArtwork$8(this.f19639c);
                return;
            case 3:
                this.f19638b.lambda$httpFileLoadError$9(this.f19639c);
                return;
            default:
                this.f19638b.lambda$fileDidFailedLoad$12(this.f19639c);
                return;
        }
    }
}
