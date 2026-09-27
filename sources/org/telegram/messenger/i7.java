package org.telegram.messenger;
public final class i7 implements Runnable {
    public final int f16632a;
    public final MediaDataController f16633b;

    public i7(MediaDataController mediaDataController, int i10) {
        this.f16632a = i10;
        this.f16633b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f16632a) {
            case 0:
                this.f16633b.lambda$fetchEmojiStatuses$232();
                return;
            case 1:
                this.f16633b.lambda$processLoadedMenuBots$5();
                return;
            case 2:
                this.f16633b.lambda$addRecentSticker$20();
                return;
            case 3:
                this.f16633b.lambda$processLoadedReactions$15();
                return;
            case 4:
                this.f16633b.lambda$clearRecentEmojiStatuses$229();
                return;
            case 5:
                this.f16633b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f16633b.lambda$loadPremiumPromo$7();
                return;
            case 7:
                this.f16633b.lambda$processLoadedPremiumPromo$9();
                return;
            case 8:
                this.f16633b.lambda$cleanupStickerSetCache$39();
                return;
            case 9:
                this.f16633b.lambda$cleanup$2();
                return;
            case 10:
                this.f16633b.lambda$loadReactions$12();
                return;
            case 11:
                this.f16633b.lambda$fetchEmojiStatuses$230();
                return;
            case 12:
                this.f16633b.lambda$loadHints$145();
                return;
            case 13:
                this.f16633b.lambda$loadAttachMenuBots$3();
                return;
            case 14:
                this.f16633b.lambda$loadHints$146();
                return;
            case 15:
                this.f16633b.lambda$clearTopPeers$149();
                return;
            case 16:
                this.f16633b.lambda$loadDraftsIfNeed$185();
                return;
            case 17:
                this.f16633b.lambda$loadDraftsIfNeed$186();
                return;
            default:
                this.f16633b.lambda$fetchNewEmojiKeywords$210();
                return;
        }
    }
}
