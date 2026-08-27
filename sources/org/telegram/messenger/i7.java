package org.telegram.messenger;

public final class i7 implements Runnable {

    public final int f20552a;

    public final MediaDataController f20553b;

    public i7(MediaDataController mediaDataController, int i10) {
        this.f20552a = i10;
        this.f20553b = mediaDataController;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20552a) {
            case 0:
                this.f20553b.lambda$fetchEmojiStatuses$232();
                break;
            case 1:
                this.f20553b.lambda$processLoadedMenuBots$5();
                break;
            case 2:
                this.f20553b.lambda$addRecentSticker$20();
                break;
            case 3:
                this.f20553b.lambda$processLoadedReactions$15();
                break;
            case 4:
                this.f20553b.lambda$clearRecentEmojiStatuses$229();
                break;
            case 5:
                this.f20553b.lambda$clearRecentStickers$17();
                break;
            case 6:
                this.f20553b.lambda$loadPremiumPromo$7();
                break;
            case 7:
                this.f20553b.lambda$processLoadedPremiumPromo$9();
                break;
            case 8:
                this.f20553b.lambda$cleanupStickerSetCache$39();
                break;
            case 9:
                this.f20553b.lambda$cleanup$2();
                break;
            case 10:
                this.f20553b.lambda$loadReactions$12();
                break;
            case 11:
                this.f20553b.lambda$fetchEmojiStatuses$230();
                break;
            case 12:
                this.f20553b.lambda$loadHints$145();
                break;
            case 13:
                this.f20553b.lambda$loadAttachMenuBots$3();
                break;
            case 14:
                this.f20553b.lambda$loadHints$146();
                break;
            case 15:
                this.f20553b.lambda$clearTopPeers$149();
                break;
            case 16:
                this.f20553b.lambda$loadDraftsIfNeed$185();
                break;
            case 17:
                this.f20553b.lambda$loadDraftsIfNeed$186();
                break;
            default:
                this.f20553b.lambda$fetchNewEmojiKeywords$210();
                break;
        }
    }
}
