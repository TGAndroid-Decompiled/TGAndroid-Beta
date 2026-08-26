package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda181 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final String f$1;
    public final boolean f$2;

    public MediaDataController$$ExternalSyntheticLambda181(MediaDataController mediaDataController, String str, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = str;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processLoadedDiceStickers$87(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadStickersByEmojiOrName$83(this.f$1, this.f$2);
                break;
        }
    }
}
