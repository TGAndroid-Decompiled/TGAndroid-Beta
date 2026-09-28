package org.telegram.messenger;
public final class k7 implements Runnable {
    public final int f16806a;
    public final MediaDataController f16807b;

    public k7(MediaDataController mediaDataController, int i10) {
        this.f16806a = i10;
        this.f16807b = mediaDataController;
    }

    @Override
    public final void run() {
        switch (this.f16806a) {
            case 0:
                this.f16807b.lambda$processLoadedMenuBots$5();
                return;
            case 1:
                this.f16807b.lambda$addRecentSticker$20();
                return;
            case 2:
                this.f16807b.lambda$processLoadedReactions$15();
                return;
            case 3:
                this.f16807b.lambda$fetchNewEmojiKeywords$211();
                return;
            case 4:
                this.f16807b.lambda$clearRecentEmojiStatuses$230();
                return;
            case 5:
                this.f16807b.lambda$clearRecentStickers$17();
                return;
            case 6:
                this.f16807b.lambda$loadReactions$12();
                return;
            case 7:
                this.f16807b.lambda$loadPremiumPromo$7();
                return;
            case 8:
                this.f16807b.lambda$processLoadedPremiumPromo$9();
                return;
            case 9:
                this.f16807b.lambda$cleanupStickerSetCache$39();
                return;
            case 10:
                this.f16807b.lambda$cleanup$2();
                return;
            case 11:
                this.f16807b.lambda$fetchEmojiStatuses$231();
                return;
            case 12:
                this.f16807b.lambda$loadDraftsIfNeed$186();
                return;
            case 13:
                this.f16807b.lambda$loadHints$145();
                return;
            case 14:
                this.f16807b.lambda$loadDraftsIfNeed$187();
                return;
            case 15:
                this.f16807b.lambda$loadAttachMenuBots$3();
                return;
            case 16:
                this.f16807b.lambda$loadHints$146();
                return;
            case 17:
                this.f16807b.lambda$clearTopPeers$149();
                return;
            default:
                this.f16807b.lambda$fetchEmojiStatuses$233();
                return;
        }
    }
}
