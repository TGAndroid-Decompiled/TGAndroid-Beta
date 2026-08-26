package org.telegram.messenger;

public final class ImageLoader$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ImageLoader f$0;
    public final String f$1;

    public ImageLoader$$ExternalSyntheticLambda2(ImageLoader imageLoader, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = imageLoader;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$preloadArtwork$8(this.f$1);
                break;
            case 1:
                this.f$0.lambda$artworkLoadError$10(this.f$1);
                break;
            case 2:
                this.f$0.lambda$cancelForceLoadingForImageReceiver$6(this.f$1);
                break;
            case 3:
                this.f$0.lambda$httpFileLoadError$9(this.f$1);
                break;
            default:
                this.f$0.lambda$fileDidFailedLoad$12(this.f$1);
                break;
        }
    }
}
