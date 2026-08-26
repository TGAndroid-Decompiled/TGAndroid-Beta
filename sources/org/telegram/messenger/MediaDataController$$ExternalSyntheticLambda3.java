package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;

    public MediaDataController$$ExternalSyntheticLambda3(MediaDataController mediaDataController, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadHints$145();
                break;
            case 1:
                this.f$0.lambda$fetchEmojiStatuses$232();
                break;
            case 2:
                this.f$0.lambda$processLoadedMenuBots$5();
                break;
            case 3:
                this.f$0.lambda$addRecentSticker$20();
                break;
            case 4:
                this.f$0.lambda$processLoadedReactions$15();
                break;
            case 5:
                this.f$0.lambda$clearRecentEmojiStatuses$229();
                break;
            case 6:
                this.f$0.lambda$clearRecentStickers$17();
                break;
            case 7:
                this.f$0.lambda$loadPremiumPromo$7();
                break;
            case 8:
                this.f$0.lambda$processLoadedPremiumPromo$9();
                break;
            case 9:
                this.f$0.lambda$cleanupStickerSetCache$39();
                break;
            case 10:
                this.f$0.lambda$cleanup$2();
                break;
            case 11:
                this.f$0.lambda$loadReactions$12();
                break;
            case 12:
                this.f$0.lambda$fetchEmojiStatuses$230();
                break;
            case 13:
                this.f$0.lambda$loadAttachMenuBots$3();
                break;
            case 14:
                this.f$0.lambda$loadHints$146();
                break;
            case 15:
                this.f$0.lambda$clearTopPeers$149();
                break;
            case 16:
                this.f$0.lambda$loadDraftsIfNeed$185();
                break;
            case 17:
                this.f$0.lambda$loadDraftsIfNeed$186();
                break;
            default:
                this.f$0.lambda$fetchNewEmojiKeywords$210();
                break;
        }
    }
}
