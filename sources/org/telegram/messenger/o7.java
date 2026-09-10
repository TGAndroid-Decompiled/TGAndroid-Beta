package org.telegram.messenger;
public final class o7 implements Runnable {
    public final int f15940a;
    public final MediaDataController f15941b;

    public o7(MediaDataController mediaDataController, int i10) {
        this.f15940a = i10;
        this.f15941b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f15940a) {
            case 0:
                this.f15941b.lambda$fetchEmojiStatuses$232();
                return;
            case 1:
                this.f15941b.lambda$processLoadedMenuBots$5();
                return;
            case 2:
                this.f15941b.lambda$addRecentSticker$20();
                return;
            case 3:
                this.f15941b.lambda$processLoadedReactions$15();
                return;
            case 4:
                this.f15941b.lambda$clearRecentEmojiStatuses$229();
                return;
            case 5:
                this.f15941b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f15941b.lambda$loadPremiumPromo$7();
                return;
            case 7:
                this.f15941b.lambda$processLoadedPremiumPromo$9();
                return;
            case 8:
                this.f15941b.lambda$cleanupStickerSetCache$39();
                return;
            case 9:
                this.f15941b.lambda$cleanup$2();
                return;
            case 10:
                this.f15941b.lambda$loadReactions$12();
                return;
            case 11:
                this.f15941b.lambda$fetchEmojiStatuses$230();
                return;
            case 12:
                this.f15941b.lambda$loadHints$145();
                return;
            case 13:
                this.f15941b.lambda$loadAttachMenuBots$3();
                return;
            case 14:
                this.f15941b.lambda$loadHints$146();
                return;
            case 15:
                this.f15941b.lambda$clearTopPeers$149();
                return;
            case 16:
                this.f15941b.lambda$loadDraftsIfNeed$185();
                return;
            case 17:
                this.f15941b.lambda$loadDraftsIfNeed$186();
                return;
            default:
                this.f15941b.lambda$fetchNewEmojiKeywords$210();
                return;
        }
    }
}
