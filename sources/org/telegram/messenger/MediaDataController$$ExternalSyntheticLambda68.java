package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda68 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final boolean f$1;
    public final int f$2;

    public MediaDataController$$ExternalSyntheticLambda68(MediaDataController mediaDataController, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaDataController;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFeaturedStickers$56(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$loadRecents$49(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processLoadedFeaturedStickers$62(this.f$1, this.f$2);
                break;
        }
    }
}
