package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final String f$1;

    public MediaDataController$$ExternalSyntheticLambda1(MediaDataController mediaDataController, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$putEmojiKeywords$214(this.f$1);
                break;
            case 1:
                this.f$0.lambda$fetchNewEmojiKeywords$207(this.f$1);
                break;
            case 2:
                this.f$0.lambda$fetchNewEmojiKeywords$208(this.f$1);
                break;
            case 3:
                this.f$0.lambda$fetchNewEmojiKeywords$213(this.f$1);
                break;
            case 4:
                this.f$0.lambda$processLoadedDiceStickers$86(this.f$1);
                break;
            case 5:
                this.f$0.lambda$fetchNewEmojiKeywords$209(this.f$1);
                break;
            default:
                this.f$0.lambda$fetchNewEmojiKeywords$211(this.f$1);
                break;
        }
    }
}
