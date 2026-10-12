package org.telegram.messenger;
public final class o7 implements Runnable {
    public final int f18003a;
    public final MediaDataController f18004b;

    public o7(MediaDataController mediaDataController, int i10) {
        this.f18003a = i10;
        this.f18004b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f18003a) {
            case 0:
                this.f18004b.lambda$processLoadedMenuBots$5();
                return;
            case 1:
                this.f18004b.lambda$addRecentSticker$20();
                return;
            case 2:
                this.f18004b.lambda$processLoadedReactions$15();
                return;
            case 3:
                this.f18004b.lambda$fetchNewEmojiKeywords$211();
                return;
            case 4:
                this.f18004b.lambda$clearRecentEmojiStatuses$230();
                return;
            case 5:
                this.f18004b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f18004b.lambda$loadReactions$12();
                return;
            case 7:
                this.f18004b.lambda$loadPremiumPromo$7();
                return;
            case 8:
                this.f18004b.lambda$processLoadedPremiumPromo$9();
                return;
            case 9:
                this.f18004b.lambda$cleanupStickerSetCache$39();
                return;
            case 10:
                this.f18004b.lambda$cleanup$2();
                return;
            case 11:
                this.f18004b.lambda$fetchEmojiStatuses$231();
                return;
            case 12:
                this.f18004b.lambda$loadDraftsIfNeed$186();
                return;
            case 13:
                this.f18004b.lambda$loadHints$145();
                return;
            case 14:
                this.f18004b.lambda$loadDraftsIfNeed$187();
                return;
            case 15:
                this.f18004b.lambda$loadAttachMenuBots$3();
                return;
            case 16:
                this.f18004b.lambda$loadHints$146();
                return;
            case 17:
                this.f18004b.lambda$clearTopPeers$149();
                return;
            default:
                this.f18004b.lambda$fetchEmojiStatuses$233();
                return;
        }
    }
}
