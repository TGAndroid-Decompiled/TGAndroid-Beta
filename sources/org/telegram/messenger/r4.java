package org.telegram.messenger;
public final class r4 implements Runnable {
    public final int f19834a;
    public final ImageLoader f19835b;
    public final String f19836c;

    public r4(ImageLoader imageLoader, String str, int i10) {
        this.f19834a = i10;
        this.f19835b = imageLoader;
        this.f19836c = str;
    }

    @Override
    public final void run() {
        switch (this.f19834a) {
            case 0:
                this.f19835b.lambda$artworkLoadError$10(this.f19836c);
                return;
            case 1:
                this.f19835b.lambda$cancelForceLoadingForImageReceiver$6(this.f19836c);
                return;
            case 2:
                this.f19835b.lambda$preloadArtwork$8(this.f19836c);
                return;
            case 3:
                this.f19835b.lambda$httpFileLoadError$9(this.f19836c);
                return;
            default:
                this.f19835b.lambda$fileDidFailedLoad$12(this.f19836c);
                return;
        }
    }
}
