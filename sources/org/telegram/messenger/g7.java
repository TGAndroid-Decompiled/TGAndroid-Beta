package org.telegram.messenger;
public final class g7 implements Runnable {
    public final int f20357a;
    public final MediaDataController f20358b;

    public g7(MediaDataController mediaDataController, int i9) {
        this.f20357a = i9;
        this.f20358b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f20357a) {
            case 0:
                this.f20358b.lambda$fetchEmojiStatuses$232();
                return;
            case 1:
                this.f20358b.lambda$processLoadedMenuBots$5();
                return;
            case 2:
                this.f20358b.lambda$addRecentSticker$20();
                return;
            case 3:
                this.f20358b.lambda$processLoadedReactions$15();
                return;
            case 4:
                this.f20358b.lambda$clearRecentEmojiStatuses$229();
                return;
            case 5:
                this.f20358b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f20358b.lambda$loadPremiumPromo$7();
                return;
            case 7:
                this.f20358b.lambda$processLoadedPremiumPromo$9();
                return;
            case 8:
                this.f20358b.lambda$cleanupStickerSetCache$39();
                return;
            case 9:
                this.f20358b.lambda$cleanup$2();
                return;
            case 10:
                this.f20358b.lambda$loadReactions$12();
                return;
            case 11:
                this.f20358b.lambda$fetchEmojiStatuses$230();
                return;
            case 12:
                this.f20358b.lambda$loadHints$145();
                return;
            case 13:
                this.f20358b.lambda$loadAttachMenuBots$3();
                return;
            case 14:
                this.f20358b.lambda$loadHints$146();
                return;
            case 15:
                this.f20358b.lambda$clearTopPeers$149();
                return;
            case 16:
                this.f20358b.lambda$loadDraftsIfNeed$185();
                return;
            case 17:
                this.f20358b.lambda$loadDraftsIfNeed$186();
                return;
            default:
                this.f20358b.lambda$fetchNewEmojiKeywords$210();
                return;
        }
    }
}
