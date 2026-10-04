package org.telegram.messenger;
public final class k7 implements Runnable {
    public final int f18339a;
    public final MediaDataController f18340b;

    public k7(MediaDataController mediaDataController, int i10) {
        this.f18339a = i10;
        this.f18340b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f18339a) {
            case 0:
                this.f18340b.lambda$processLoadedMenuBots$5();
                return;
            case 1:
                this.f18340b.lambda$addRecentSticker$20();
                return;
            case 2:
                this.f18340b.lambda$processLoadedReactions$15();
                return;
            case 3:
                this.f18340b.lambda$fetchNewEmojiKeywords$211();
                return;
            case 4:
                this.f18340b.lambda$clearRecentEmojiStatuses$230();
                return;
            case 5:
                this.f18340b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f18340b.lambda$loadReactions$12();
                return;
            case 7:
                this.f18340b.lambda$loadPremiumPromo$7();
                return;
            case 8:
                this.f18340b.lambda$processLoadedPremiumPromo$9();
                return;
            case 9:
                this.f18340b.lambda$cleanupStickerSetCache$39();
                return;
            case 10:
                this.f18340b.lambda$cleanup$2();
                return;
            case 11:
                this.f18340b.lambda$fetchEmojiStatuses$231();
                return;
            case 12:
                this.f18340b.lambda$loadDraftsIfNeed$186();
                return;
            case 13:
                this.f18340b.lambda$loadHints$145();
                return;
            case 14:
                this.f18340b.lambda$loadDraftsIfNeed$187();
                return;
            case 15:
                this.f18340b.lambda$loadAttachMenuBots$3();
                return;
            case 16:
                this.f18340b.lambda$loadHints$146();
                return;
            case 17:
                this.f18340b.lambda$clearTopPeers$149();
                return;
            default:
                this.f18340b.lambda$fetchEmojiStatuses$233();
                return;
        }
    }
}
