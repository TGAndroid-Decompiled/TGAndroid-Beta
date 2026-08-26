package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda30 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final boolean f$1;

    public MediaDataController$$ExternalSyntheticLambda30(MediaDataController mediaDataController, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processLoadedFeaturedStickers$59(this.f$1);
                break;
            default:
                this.f$0.lambda$loadFeaturedStickers$55(this.f$1);
                break;
        }
    }
}
