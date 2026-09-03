package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f19246a;
    public final MediaDataController f19247b;

    public l7(MediaDataController mediaDataController, int i10) {
        this.f19246a = i10;
        this.f19247b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                this.f19247b.lambda$fetchEmojiStatuses$232();
                return;
            case 1:
                this.f19247b.lambda$processLoadedMenuBots$5();
                return;
            case 2:
                this.f19247b.lambda$addRecentSticker$20();
                return;
            case 3:
                this.f19247b.lambda$processLoadedReactions$15();
                return;
            case 4:
                this.f19247b.lambda$clearRecentEmojiStatuses$229();
                return;
            case 5:
                this.f19247b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f19247b.lambda$loadPremiumPromo$7();
                return;
            case 7:
                this.f19247b.lambda$processLoadedPremiumPromo$9();
                return;
            case 8:
                this.f19247b.lambda$cleanupStickerSetCache$39();
                return;
            case 9:
                this.f19247b.lambda$cleanup$2();
                return;
            case 10:
                this.f19247b.lambda$loadReactions$12();
                return;
            case 11:
                this.f19247b.lambda$fetchEmojiStatuses$230();
                return;
            case 12:
                this.f19247b.lambda$loadHints$145();
                return;
            case 13:
                this.f19247b.lambda$loadAttachMenuBots$3();
                return;
            case 14:
                this.f19247b.lambda$loadHints$146();
                return;
            case 15:
                this.f19247b.lambda$clearTopPeers$149();
                return;
            case 16:
                this.f19247b.lambda$loadDraftsIfNeed$185();
                return;
            case 17:
                this.f19247b.lambda$loadDraftsIfNeed$186();
                return;
            default:
                this.f19247b.lambda$fetchNewEmojiKeywords$210();
                return;
        }
    }
}
