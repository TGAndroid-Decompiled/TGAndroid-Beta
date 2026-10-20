package org.telegram.messenger;
public final class u4 implements Runnable {
    public final int f19640a;
    public final ImageLoader f19641b;
    public final String f19642c;

    public u4(ImageLoader imageLoader, String str, int i10) {
        this.f19640a = i10;
        this.f19641b = imageLoader;
        this.f19642c = str;
    }

    @Override
    public final void run() {
        switch (this.f19640a) {
            case 0:
                this.f19641b.lambda$artworkLoadError$10(this.f19642c);
                return;
            case 1:
                this.f19641b.lambda$cancelForceLoadingForImageReceiver$6(this.f19642c);
                return;
            case 2:
                this.f19641b.lambda$preloadArtwork$8(this.f19642c);
                return;
            case 3:
                this.f19641b.lambda$httpFileLoadError$9(this.f19642c);
                return;
            default:
                this.f19641b.lambda$fileDidFailedLoad$12(this.f19642c);
                return;
        }
    }
}
