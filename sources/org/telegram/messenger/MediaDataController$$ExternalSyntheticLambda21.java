package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final int f$1;

    public MediaDataController$$ExternalSyntheticLambda21(MediaDataController mediaDataController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaDataController;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fetchEmojiStatuses$231(this.f$1);
                break;
            default:
                this.f$0.lambda$processLoadedStickers$103(this.f$1);
                break;
        }
    }
}
