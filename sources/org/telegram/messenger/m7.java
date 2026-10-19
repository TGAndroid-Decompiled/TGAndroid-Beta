package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f18945a;
    public final MediaDataController f18946b;

    public m7(MediaDataController mediaDataController, int i10) {
        this.f18945a = i10;
        this.f18946b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$processLoadedMenuBots$5();
                return;
            case 1:
                this.f18946b.lambda$addRecentSticker$20();
                return;
            case 2:
                this.f18946b.lambda$processLoadedReactions$15();
                return;
            case 3:
                this.f18946b.lambda$fetchNewEmojiKeywords$211();
                return;
            case 4:
                this.f18946b.lambda$clearRecentEmojiStatuses$230();
                return;
            case 5:
                this.f18946b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f18946b.lambda$loadReactions$12();
                return;
            case 7:
                this.f18946b.lambda$loadPremiumPromo$7();
                return;
            case 8:
                this.f18946b.lambda$processLoadedPremiumPromo$9();
                return;
            case 9:
                this.f18946b.lambda$cleanupStickerSetCache$39();
                return;
            case 10:
                this.f18946b.lambda$cleanup$2();
                return;
            case 11:
                this.f18946b.lambda$fetchEmojiStatuses$231();
                return;
            case 12:
                this.f18946b.lambda$loadDraftsIfNeed$186();
                return;
            case 13:
                this.f18946b.lambda$loadHints$145();
                return;
            case 14:
                this.f18946b.lambda$loadDraftsIfNeed$187();
                return;
            case 15:
                this.f18946b.lambda$loadAttachMenuBots$3();
                return;
            case 16:
                this.f18946b.lambda$loadHints$146();
                return;
            case 17:
                this.f18946b.lambda$clearTopPeers$149();
                return;
            default:
                this.f18946b.lambda$fetchEmojiStatuses$233();
                return;
        }
    }
}
